package com.m306.tablesession.service;

import com.m306.tablesession.repository.model.Customer;
import com.m306.tablesession.repository.CustomerRepository;
import jakarta.annotation.security.RolesAllowed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAll() {
        return customerRepository.findAll();
    }
    public Customer insertCustomer(Customer clothing) {
        return customerRepository.save(clothing);
    }
}
