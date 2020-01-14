package com.training.kafkademo.controller;

import com.training.kafkademo.documentandentity.Employee;
import com.training.kafkademo.service.MyFileHandlerServices;



public class WriterThread extends Thread
{

    private MyFileHandlerServices myFileHandlerReference;
    int count;
    //private MyCollection collectionObj;

    public WriterThread(MyFileHandlerServices specificObject)
    {
        super();
        myFileHandlerReference=specificObject;
        count=1;
    }

    public void run()
    {

        while (this.count<=100)
        {
            synchronized(ReaderThread.finalCollection)
            {
                Employee employee = ReaderThread.finalCollection.get();
                myFileHandlerReference.write(employee);

            }
            count++;
        }
    }
}



