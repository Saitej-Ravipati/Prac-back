package com.site.Prac.employeeDetails.controller;

import com.site.Prac.employeeDetails.model.Admin;
import com.site.Prac.employeeDetails.model.Employee;
import com.site.Prac.employeeDetails.exception.UnauthorizedAccessException;
import com.site.Prac.employeeDetails.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/register")
    public ResponseEntity<Admin> registerAdmin(@RequestBody Admin admin) {
        Admin registeredAdmin = adminService.registerAdmin(admin);
        return ResponseEntity.ok(registeredAdmin);
    }

    @PostMapping("/login")
    public ResponseEntity<String> adminLogin(@RequestBody Admin admin) {
        boolean isValid = adminService.validateAdminCredentials(admin.getUsername(), admin.getPassword());
        if(isValid) {
            // In a real-world application, you'd return a JWT token or session ID here
            return ResponseEntity.ok("TokenStringSample");
        } else {
            return ResponseEntity.status(403).body("Invalid credentials");
        }
    }

    // Endpoint to create a new employee
    @PostMapping("/employees")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee, @RequestHeader("userId") String loggedInUserId) {
        try {
            Employee result = adminService.createEmployee(employee, loggedInUserId);
            return ResponseEntity.ok(result);
        } catch (UnauthorizedAccessException e) {
            return ResponseEntity.status(403).build();
        }
    }

    // Endpoint to fetch all employees
    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAllEmployees(@RequestHeader("userId") String loggedInUserId) {
        try {
            List<Employee> employees = adminService.getAllEmployees(loggedInUserId);
            return ResponseEntity.ok(employees);
        } catch (UnauthorizedAccessException e) {
            return ResponseEntity.status(403).build();
        }
    }

    // Endpoint to fetch a specific employee by ID
    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable String id, @RequestHeader("userId") String loggedInUserId) {
        try {
            Employee result = adminService.getEmployeeById(id, loggedInUserId);
            if(result != null) {
                return ResponseEntity.ok(result);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (UnauthorizedAccessException e) {
            return ResponseEntity.status(403).build();
        }
    }

    // Endpoint to update an employee by ID
    @PutMapping("/employees/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable String id, @RequestBody Employee updatedEmployee, @RequestHeader("userId") String loggedInUserId) {
        try {
            Employee result = adminService.updateEmployee(id, updatedEmployee, loggedInUserId);
            if(result != null) {
                return ResponseEntity.ok(result);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (UnauthorizedAccessException e) {
            return ResponseEntity.status(403).build();
        }
    }

    // Endpoint to delete an employee by ID
    @DeleteMapping("/employees/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable String id, @RequestHeader("userId") String loggedInUserId) {
        try {
            boolean isDeleted = adminService.deleteEmployee(id, loggedInUserId);
            if(isDeleted) {
                return ResponseEntity.ok().build();
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (UnauthorizedAccessException e) {
            return ResponseEntity.status(403).build();
        }
    }
}
