package com.training.spring.day0.util;

public class CustomerNotFoundException extends RuntimeException{

    CustomerNotFoundException(long id){
        super("Customer Not found : "+id);
    }
}
