package com.training.kafkademo.service.impl;

import com.training.kafkademo.documentandentity.Employee;
import com.training.kafkademo.documentandentity.EmployeeDocument;
import com.training.kafkademo.repository.EmployeeMongoRepository;
import com.training.kafkademo.service.EmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeMongoServiceImpl implements EmployeeService {

    @Autowired
    EmployeeMongoRepository employeeMongoRepository;

    @Override
    public void save(Employee employee) {
        EmployeeDocument employeeDocument=new EmployeeDocument();
        BeanUtils.copyProperties(employee,employeeDocument);
        employeeMongoRepository.insertOne(employeeDocument);
    }
}
