package com.m306.tablesession.controller;

import com.m306.tablesession.repository.model.Employee;
import com.m306.tablesession.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value="/addEmployee", method= RequestMethod.GET)
    public String addEmployee(Model model) {
        Employee newEmployee = new Employee();
        newEmployee.setRole("USER");

        model.addAttribute("employee", newEmployee);
        return "addemployee";
    }

    @RequestMapping(value="/saveEmployee", method=RequestMethod.POST, consumes="application/x-www-form-urlencoded;charset=UTF-8")
    public String saveEmployee(Model model, @ModelAttribute(name = "employee") Employee employee) {
        employeeService.insertEmployee(employee);
        return "redirect:/";
    }

    @RequestMapping(value="/deleteEmployee", method=RequestMethod.GET)
    public String deleteEmployee(@RequestParam String username) {
        System.out.println(username);
        employeeService.deleteEmployee(username);
        return "redirect:/";
    }
}
