package com.training.kafkademo.controller;

import com.training.kafkademo.documentandentity.Employee;
import com.training.kafkademo.documentandentity.MyCollection;
import com.training.kafkademo.service.MyFileHandlerServices;

public class ReaderThread extends Thread
    {
        private MyFileHandlerServices myFileHandlerReference;
        public static MyCollection finalCollection=MyCollection.getInstance();

        ReaderThread( MyFileHandlerServices specificObject)
        {
            super();
            myFileHandlerReference=specificObject;
            //this.collectionObj = collectionObj;
        }
        public void run()
        {
            int count=0;
            while (count<100)
            {
                synchronized (finalCollection)
                {
                    Employee employee = myFileHandlerReference.read();
                    finalCollection.add(employee);
                }
                count++;
            }
        }
    }


