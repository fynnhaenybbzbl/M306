package com.m306.tablesession.security;

import com.m306.tablesession.repository.model.Employee;
import com.m306.tablesession.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(
        securedEnabled = true)
public class BasicConfiguration extends GlobalMethodSecurityConfiguration {

    @Autowired
    private EmployeeService employeeService;

    @Bean
    public UserDetailsManager userDetailsService() {
        List<Employee> employees = employeeService.getAll();
        List<UserDetails> userDetailsList = new ArrayList<>();

        for (Employee employee : employees) {
            UserDetails userDetails = User.withUsername(employee.getUsername())
                    .password("{noop}" + employee.getPassword())
                    .roles(employee.getRole())
                    .build();
            userDetailsList.add(userDetails);
        }

        return new InMemoryUserDetailsManager(userDetailsList);

    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        return encoder;
    }
}