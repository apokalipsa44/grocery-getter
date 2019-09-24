package com.machau.grocerygetter.repository;

import com.machau.grocerygetter.model.Sales;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;

public interface SalesRepository extends CrudRepository<Sales, Long> {

    public Iterable<Sales> findByClients_Name(String name);

    public Iterable<Sales> findByClients_LastName(String lastName);

    public Iterable<Sales> findBySaleDate(Date saleDate);
}
