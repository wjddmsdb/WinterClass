package com.example.test.controller;


import com.example.test.Service.CustomerService;
import com.example.test.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class CustomerController {
//주석
    private final CustomerService customerService;
//dev commit
    @GetMapping("/customers")
    public String customers(Model model) {
        model.addAttribute("customers", customerService.findAll());
        return "customers";
    }
}
