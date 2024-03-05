package com.m306.tablesession.repository;

import com.m306.tablesession.repository.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
