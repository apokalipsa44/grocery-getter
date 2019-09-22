package com.machau.grocerygetter.repository;

import com.machau.grocerygetter.model.Products;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProductsRepository extends CrudRepository<Products, Long> {
    public Optional<Products> findByName(String name);
}
