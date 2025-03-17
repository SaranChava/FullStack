package com.training.spring.day0.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.util.Objects;

@Entity
public class Employee {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String empname;
    private String role;

    public Employee() {
    }

    public Employee(String name, String role) {
        this.empname = name;
        this.role = role;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String name) {
        this.empname = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return Objects.equals(id, employee.id) && Objects.equals(getEmpname(), employee.getEmpname()) && Objects.equals(getRole(), employee.getRole());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, getEmpname(), getRole());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + empname + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
