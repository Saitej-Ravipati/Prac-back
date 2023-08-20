package com.site.Prac.employeeDetails.repository;

import com.site.Prac.employeeDetails.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {

    List<Employee> findByFirstName(String firstName);

    List<Employee> findByLastName(String lastName);
}
