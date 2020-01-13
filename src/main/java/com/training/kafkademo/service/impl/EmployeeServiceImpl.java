package com.training.kafkademo.service.impl;

import com.training.kafkademo.documentandentity.Employee;
import com.training.kafkademo.repository.EmployeeRepository;
import com.training.kafkademo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }
}
