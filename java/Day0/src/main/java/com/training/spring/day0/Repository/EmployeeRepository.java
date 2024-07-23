package com.training.spring.day0.Repository;

import com.training.spring.day0.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
