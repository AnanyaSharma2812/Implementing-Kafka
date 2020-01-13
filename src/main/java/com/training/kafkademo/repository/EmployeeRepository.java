package com.training.kafkademo.repository;

import com.training.kafkademo.documentandentity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Long> {
}
