package com.m306.tablesession.service;

import com.m306.tablesession.repository.EmployeeRepository;
import com.m306.tablesession.repository.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee insertEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(String username) {
        Employee employeeToDelete = employeeRepository.findByUsername(username);
        if (employeeToDelete != null) {
            employeeRepository.delete(employeeToDelete);
        }
    }

    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }
}
