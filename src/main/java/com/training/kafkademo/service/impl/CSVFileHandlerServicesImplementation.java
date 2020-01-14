package com.training.kafkademo.service.impl;

import com.training.kafkademo.documentandentity.Employee;
import com.training.kafkademo.service.MyFileHandlerServices;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;


@Service
public class CSVFileHandlerServicesImplementation implements MyFileHandlerServices
{
    RandomAccessFile readFile;
    static int counter=0;

    {
        try {
            readFile=new RandomAccessFile("/Users/viharikasaisreedhulipalla/Downloads/employee.csv","rw");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    @Override
    public Employee read() {
        try {
            readFile.seek(counter);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Employee emp=new Employee();
        DateFormat formatter = new SimpleDateFormat("MM/dd/yy");
        try {
            String line = readFile.readLine();
            if (line != null) {
                String[] members = line.split(",");
                emp.setFirstName(members[0]);
                emp.setLastName(members[1]);
                emp.setDateOfBirth(formatter.parse(members[2]));
                emp.setExperience(Double.parseDouble(members[3]));

            }
            counter=counter+line.length()+1;


        }
        catch (IOException |ParseException exception)
        {
            System.out.println(exception.getMessage());
        }


        return null;
    }

    @Override
    public void write(Employee emp) {

        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yy");
        String DateOfBirth = dateFormat.format(emp.getDateOfBirth());



//        Document record=new Document().append("first_name",emp.getFirstName()).append("last_name",emp.getLastName()).append("dateOfBirth",emp.getDateOfBirth())
//                .append("experience",emp.getExperience());
//        collection.insertOne(record);


    }
}
