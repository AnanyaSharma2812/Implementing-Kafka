package com.training.kafkademo.documentandentity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.ProducerFactory;

import java.util.ArrayList;
import java.util.List;
@Configuration
public class MyCollection
{
        List<Employee> list_employee = new ArrayList<>();
        Employee[] e = new Employee[300];
        protected int readCounter = 0;
        protected int writeCounter = 0;



        private static Object lockObject_add = new Object();
        private static MyCollection instance_add = null;

        synchronized void add(Employee e)
        {
            if (writeCounter < 300) {
                list_employee.add(e);
                writeCounter++;
            }
        }

        public synchronized Employee get()
        {
            Employee get_emp = list_employee.get(readCounter++);
            return get_emp;
        }
}


