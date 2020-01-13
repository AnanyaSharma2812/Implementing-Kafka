package com.training.kafkademo.service;

import com.training.kafkademo.documentandentity.Employee;

public interface MyFileHandlerServices
{
    Employee read();
    void write(Employee e);
}
