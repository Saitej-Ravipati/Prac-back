package com.site.Prac.employeeDetails.service;

import com.site.Prac.employeeDetails.model.Admin;
import com.site.Prac.employeeDetails.model.Employee;
import com.site.Prac.employeeDetails.exception.UnauthorizedAccessException;
import com.site.Prac.employeeDetails.repository.EmployeeRepository;
import com.site.Prac.employeeDetails.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private AdminRepository adminRepository;

    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public Admin registerAdmin(Admin admin) {
        String hashedPassword = passwordEncoder.encode(admin.getPassword());
        admin.setPassword(hashedPassword);
        return adminRepository.save(admin);
    }

    public boolean validateAdminCredentials(String username, String password) {
        Optional<Admin> adminOpt = adminRepository.findByUsername(username);
        if (adminOpt.isPresent()) {
            Admin admin = adminOpt.get();
            return passwordEncoder.matches(password, admin.getPassword());
        }
        return false;
    }

    public Employee createEmployee(Employee employee, String loggedInUserId) throws UnauthorizedAccessException {
        if(isAdmin(loggedInUserId)) {
            return employeeRepository.save(employee);
        } else {
            throw new UnauthorizedAccessException("Unauthorized Access");
        }
    }

    public List<Employee> getAllEmployees(String loggedInUserId) throws UnauthorizedAccessException {
        if(isAdmin(loggedInUserId)) {
            return employeeRepository.findAll();
        } else {
            throw new UnauthorizedAccessException("Unauthorized Access");
        }
    }

    public Employee getEmployeeById(String id, String loggedInUserId) throws UnauthorizedAccessException {
        if(isAdmin(loggedInUserId)) {
            return employeeRepository.findById(id).orElse(null);
        } else {
            throw new UnauthorizedAccessException("Unauthorized Access");
        }
    }

    public Employee updateEmployee(String id, Employee updatedEmployee, String loggedInUserId) throws UnauthorizedAccessException {
        if(isAdmin(loggedInUserId)) {
            if(employeeRepository.existsById(id)) {
                return employeeRepository.save(updatedEmployee);
            } else {
                return null;
            }
        } else {
            throw new UnauthorizedAccessException("Unauthorized Access");
        }
    }

    public boolean deleteEmployee(String id, String loggedInUserId) throws UnauthorizedAccessException {
        if(isAdmin(loggedInUserId)) {
            if(employeeRepository.existsById(id)) {
                employeeRepository.deleteById(id);
                return true;
            } else {
                return false;
            }
        } else {
            throw new UnauthorizedAccessException("Unauthorized Access");
        }
    }

    private boolean isAdmin(String userId) {
        Optional<Admin> admin = adminRepository.findById(userId);
        return admin.isPresent();
    }
}
