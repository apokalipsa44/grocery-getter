package com.machau.grocerygetter.repository;

import com.machau.grocerygetter.model.Products;
import com.machau.grocerygetter.model.ProductsType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface ProductsRepository extends CrudRepository<Products, Long> {
//    public Optional<Products> findByName(String name);
//
//    public Iterable<Products> findByProductsType(ProductsType productsType);
}
