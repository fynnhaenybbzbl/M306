package com.m306.tablesession.controller;

import com.m306.tablesession.repository.model.Customer;
import com.m306.tablesession.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("customerList", customerService.getAll());
        return "index";
    }

    @RequestMapping(value="/addnew", method=RequestMethod.GET)
    public String addCustomer(Model model) {
        model.addAttribute("customer", new Customer());
        return "addcustomer";
    }

    @RequestMapping(value="/save", method=RequestMethod.POST, consumes="application/x-www-form-urlencoded;charset=UTF-8")
    public String saveCustomer(Customer customer) {
        customerService.insertCustomer(customer);
        return "redirect:/";
    }

}