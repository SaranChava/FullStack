package com.training.spring.day0.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.io.FileReader;
import java.util.Objects;
@Entity
public class Customer {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String custname;
    private String mobile;
    private String email;

    public Customer() {
    }

    public Customer(String custName, String mobile, String email) {
        this.custname = custName;
        this.mobile = mobile;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custName='" + custname + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer customer)) return false;
        return Objects.equals(getCustname(), customer.getCustname()) && Objects.equals(getMobile(), customer.getMobile()) && Objects.equals(getEmail(), customer.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCustname(), getMobile(), getEmail());
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custName) {
        this.custname = custName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
