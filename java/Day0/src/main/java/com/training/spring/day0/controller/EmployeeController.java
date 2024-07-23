package com.training.spring.day0.controller;

import com.training.spring.day0.Repository.EmployeeRepository;
import com.training.spring.day0.model.Employee;
import com.training.spring.day0.util.EmployeeNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    private final EmployeeRepository repository;

    EmployeeController(EmployeeRepository repository){
        this.repository=repository;
    }

    @GetMapping("/employees")
    Iterable<Employee> all(){
        return repository.findAll();
    }

    @GetMapping("/employees/{id}")
    Employee one(@PathVariable long id){
        return repository.findById(id).orElseThrow(()->new EmployeeNotFoundException(id));
    }

    @PostMapping("/employees")
    Employee newEmployee(@RequestBody Employee newEmployee){
        return repository.save(newEmployee);
    }
}
