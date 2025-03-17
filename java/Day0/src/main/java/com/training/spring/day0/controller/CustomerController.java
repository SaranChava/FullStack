package com.training.spring.day0.controller;

import com.training.spring.day0.Repository.CustomerRepository;
import com.training.spring.day0.model.Customer;
import com.training.spring.day0.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    private final CustomerRepository repository;

    public CustomerController(CustomerRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/customer")
    Iterable<Customer> all(){
        return repository.findAll();
    }

    @PostMapping("/customer")
    Customer newCustomer(@RequestBody Customer newCustomer){
        return repository.save(newCustomer);
    }

    @GetMapping("/customer/{name}")
    List<Customer> getCustomerByName(@PathVariable String name){
        return repository.getCustomerByName(name);
    }

}
