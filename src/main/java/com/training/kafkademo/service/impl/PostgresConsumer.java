package com.training.kafkademo.service.impl;

import com.training.kafkademo.documentandentity.Employee;
import com.training.kafkademo.dto.EmployeeDTO;
import com.training.kafkademo.service.EmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class PostgresConsumer {
    @Autowired
    EmployeeService employeeService;


    void save(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeDTO, employee);
        Employee employeeCreated = employeeService.save(employee);
    }



}
