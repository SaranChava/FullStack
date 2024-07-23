package com.training.spring.day0.Repository;

import com.training.spring.day0.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    @Query("SELECT c from Customer c where c.custname = :name")
    List<Customer> getCustomerByName(@Param("name") String name);
}
