package com.training.kafkademo.controller;


import com.training.kafkademo.documentandentity.Employee;
import com.training.kafkademo.service.MyFileHandlerServices;
import com.training.kafkademo.service.impl.CSVFileHandlerServicesImplementation;
import com.training.kafkademo.service.impl.JSONFileHandlerServicesImplementation;
import com.training.kafkademo.service.impl.XMLFileHandlerServicesImplementation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/startThreads")
public class EmployeeController {

    @GetMapping("/startThreads")
    public void startThreads()
    {
        MyFileHandlerServices XMLObject1=new XMLFileHandlerServicesImplementation();
        ReaderThread thread1 = new ReaderThread(XMLObject1);
        MyFileHandlerServices CSVObject1=new CSVFileHandlerServicesImplementation();
        ReaderThread thread2 = new ReaderThread(CSVObject1);
        MyFileHandlerServices JSONObject1=new JSONFileHandlerServicesImplementation();
        ReaderThread thread3 = new ReaderThread(JSONObject1);

        thread1.start();
        thread2.start();
        thread3.start();
        try
        {
            thread1.join();
            thread2.join();
            thread3.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        MyFileHandlerServices XMLObject2=new XMLFileHandlerServicesImplementation();
        WriterThread thread4 = new WriterThread(XMLObject2);
        MyFileHandlerServices CSVObject2=new CSVFileHandlerServicesImplementation();
        WriterThread thread5 = new WriterThread(CSVObject2);
        MyFileHandlerServices JSONObject2=new JSONFileHandlerServicesImplementation();
        WriterThread thread6 = new WriterThread(JSONObject2);

        thread4.start();
        thread5.start();
        thread6.start();
    }

}


