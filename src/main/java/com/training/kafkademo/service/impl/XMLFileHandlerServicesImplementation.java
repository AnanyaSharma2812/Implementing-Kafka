package com.training.kafkademo.service.impl;

import com.training.kafkademo.documentandentity.Employee;
import com.training.kafkademo.service.MyFileHandlerServices;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;


@Service
public class XMLFileHandlerServicesImplementation implements MyFileHandlerServices
{
    Employee employee=new Employee();
    FileOutputStream file;
    private static int iter=0;

    {
        try {
            file = new FileOutputStream(new File("newemployee.xml"),true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Employee read() {
            try
            {
                File file1 = new File("/Users/shaalikaashukla/IdeaProjects/Project1/employee.xml");
                DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
                Document doc = documentBuilder.parse(file1);
                doc.getDocumentElement().normalize();
                System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
                NodeList nodeList = doc.getElementsByTagName("employee");
                //for (int itr = 0; itr < nodeList.getLength(); itr++)
                if(iter<=nodeList.getLength())
                {
                    Node node = nodeList.item(iter);
                    System.out.println("\nNode Name :" + node.getNodeName());
                    if (node.getNodeType() == Node.ELEMENT_NODE)
                    {
                        //   String strDate = dateFormat.format(date);
                        Element eElement = (Element) node;
                        System.out.println("First Name: "+eElement.getElementsByTagName("firstName").item(0).getTextContent());
                        employee.setFirstName(eElement.getElementsByTagName("firstName").item(0).getTextContent());
                        System.out.println("Last Name: "+eElement.getElementsByTagName("lastName").item(0).getTextContent());
                        employee.setLastName(eElement.getElementsByTagName("lastName").item(0).getTextContent());
                        System.out.println("Date of birth: "+eElement.getElementsByTagName("dateOfBirth").item(0).getTextContent());
                        String str=eElement.getElementsByTagName("dateOfBirth").item(0).getTextContent();
                        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(str);
                        employee.setDateOfBirth(date1);
                        System.out.println("Experience: "+eElement.getElementsByTagName("experience").item(0).getTextContent());
                        String str1=eElement.getElementsByTagName("experience").item(0).getTextContent();
                        double convert=new Double(str1);
                        employee.setExperience(convert);
                    }
                    iter++;
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            return employee;
        }
    @Override
    public void write(Employee e) {

    }
}
