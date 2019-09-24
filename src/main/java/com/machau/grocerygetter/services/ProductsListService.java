package com.machau.grocerygetter.services;

import com.machau.grocerygetter.model.Products;
import com.machau.grocerygetter.model.ProductsType;
import com.machau.grocerygetter.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductsListService {

    List<Products> productsList=new ArrayList<>();

    private ProductsRepository productsRepository;

    @Autowired
    public ProductsListService(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }




    public List<Products> getProductsList() {
//        productsList.clear();
        productsListInit();
        Iterable<Products>productsIterable=productsRepository.findAll();
        productsIterable.forEach(productsList::add);
        return  productsList ;
    }

    private List<Products> productsListInit() {
        productsList.add(new Products("Marchewka", 3.75, ProductsType.VEGETABLES, LocalDate.now().plusDays(14L)));
        productsList.add(new Products("Pepsi", 1.42, ProductsType.DRINKS, LocalDate.now().plusDays(99L)));
        productsList.add(new Products("Chlebek", 0.99, ProductsType.BREAD, LocalDate.now().plusDays(7L)));
        productsList.add(new Products("Chałka", 2.55, ProductsType.BREAD, LocalDate.now().plusDays(14L)));
        productsList.add(new Products("Apple", 3.75, ProductsType.FRUITS, LocalDate.now().plusDays(10L)));
        productsList.forEach(e->productsRepository.save(e));
        return productsList;

    }
}
