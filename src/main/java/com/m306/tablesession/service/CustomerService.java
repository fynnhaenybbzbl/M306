package com.m306.tablesession.service;

import com.m306.tablesession.repository.model.Customer;
import com.m306.tablesession.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository personRepository;

    public List<Customer> getAll() {
        return personRepository.findAll();
    }

    public Customer insertCustomer(Customer clothing) {
        return personRepository.save(clothing);
    }
}
