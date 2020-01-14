package com.training.kafkademo.controller;

<<<<<<< HEAD
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

=======

import com.training.kafkademo.documentandentity.Employee;
import com.training.kafkademo.documentandentity.MyCollection;
import com.training.kafkademo.service.MyFileHandlerServices;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class ReaderThread extends Thread
{
    private MyFileHandlerServices myFileHandlerReference;
    public static MyCollection finalCollection=MyCollection.getInstance();

    public ReaderThread(MyFileHandlerServices specificObject)
    {
        super();
        myFileHandlerReference=specificObject;
    }

    public void run()
    {
        int count=0;
        while (count<100)
        {
            System.out.println("In the thread"+myFileHandlerReference.toString());
//            synchronized (finalCollection)
//            {
//                Employee employee = myFileHandlerReference.read();
//                finalCollection.add(employee);
//            }
//            count++;
        }
    }
}
>>>>>>> c429f1a8f79141faa0bcce09728233639e9fa8d2

