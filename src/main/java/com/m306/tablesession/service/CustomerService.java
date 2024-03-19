package com.m306.tablesession.service;

import com.m306.tablesession.repository.CustomerRepository;
import com.m306.tablesession.repository.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAll() {
        return customerRepository.findAll();
    }
    public void deleteCustomer(long id) {
        Optional<Customer> customer = customerRepository.findById(id);
        if(customer.isPresent()) {
            Customer presentCustomer = customer.get();
            customerRepository.delete(presentCustomer);
        }
    }
    public Customer insertCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
