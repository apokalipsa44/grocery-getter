package com.machau.grocerygetter.view;

import com.machau.grocerygetter.model.Products;
import com.machau.grocerygetter.services.ProductsListService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductsView extends VerticalLayout {

    ProductsListService productsListService;

    @Autowired
    public ProductsView(ProductsListService productsListService) {
        this.productsListService=productsListService;


        addGrid();

    }

    private void addGrid() {
        Grid<Products> grid = new Grid<>(Products.class);
        grid.setItems(productsListService.getProductsList());
        add(grid);
    }


}
