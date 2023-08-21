package com.site.Prac.employeeDetails.service;

import com.site.Prac.employeeDetails.exception.UnauthorizedAccessException;
import com.site.Prac.employeeDetails.model.Employee;
import com.site.Prac.employeeDetails.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee getEmployeeById(String id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee updateEmployee(String id, Employee employee, String loggedInUserId) {
        if (!id.equals(loggedInUserId)) {
            throw new UnauthorizedAccessException("Unauthorized Access");
        }
        if (employeeRepository.existsById(id)) {
            return employeeRepository.save(employee);
        }
        return null;
    }

    // Employees should not have delete access
     public boolean deleteEmployee(String id) {
        if (employeeRepository.existsById(id)) {
            employeeRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public List<Employee> getEmployeeByFirstName(String firstName) {
        return employeeRepository.findByFirstName(firstName);
    }

    public List<Employee> getEmployeeByLastName(String lastName) {
        return employeeRepository.findByLastName(lastName);
    }

    public Employee getEmployeeDataForUser(String loggedInUserId) {
        return employeeRepository.findById(loggedInUserId).orElseThrow(() -> new UnauthorizedAccessException("Unauthorized Access"));
    }
}
