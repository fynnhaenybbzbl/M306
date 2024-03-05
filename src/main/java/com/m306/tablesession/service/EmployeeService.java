package com.m306.tablesession.service;

import com.m306.tablesession.repository.model.Employee;
import com.m306.tablesession.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository userRepository;

    public List<Employee> getAll() {
        return userRepository.findAll();
    }
}
