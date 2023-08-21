package com.site.Prac.employeeDetails.repository;

import com.site.Prac.employeeDetails.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
    List<Employee> findByFirstName(String firstName);

    List<Employee> findByLastName(String lastName);
    // Other required methods if any
}
