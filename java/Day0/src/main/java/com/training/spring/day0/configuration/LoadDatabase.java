package com.training.spring.day0.configuration;

import com.training.spring.day0.Repository.CustomerRepository;
import com.training.spring.day0.Repository.EmployeeRepository;
import com.training.spring.day0.model.Customer;
import com.training.spring.day0.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository employeeRepository, CustomerRepository customerRepository){
        return args -> {

        };
    }
}
