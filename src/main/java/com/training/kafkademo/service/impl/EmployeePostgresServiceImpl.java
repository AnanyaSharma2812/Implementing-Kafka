package com.training.kafkademo.service.impl;

import com.training.kafkademo.documentandentity.Employee;
import com.training.kafkademo.repository.EmployeePostgresRepository;
import com.training.kafkademo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeePostgresServiceImpl implements EmployeeService {
    @Autowired
    EmployeePostgresRepository employeePostgresRepository;

    @Override
    public void save(Employee employeeEntity){
        Employee employee1 = employeePostgresRepository.save(employeeEntity);
    }

}
