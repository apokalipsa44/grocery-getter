package com.machau.grocerygetter.view;

import com.machau.grocerygetter.model.Products;
import com.machau.grocerygetter.services.ProductsListService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ProductsView extends VerticalLayout {

    ProductsListService productsListService = new ProductsListService();

    public ProductsView() {
        Grid<Products> grid = new Grid<>(Products.class);
        grid.setItems(productsListService.getProductsList());
        add(grid);

    }


}
