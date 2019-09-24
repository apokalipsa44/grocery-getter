package com.machau.grocerygetter.view;

import com.machau.grocerygetter.model.Products;
import com.machau.grocerygetter.services.ProductsListService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.StreamResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

@Service
public class ProductsView extends VerticalLayout {

    ProductsListService productsListService;

    @Autowired
    public ProductsView(ProductsListService productsListService) {
        this.productsListService=productsListService;

        Image image=new Image("frontend/images/groceries.jpg", "groceries");

        image.setHeight("250px");

        addGrid();
        add(image);

    }

    private void addGrid() {
        Grid<Products> grid = new Grid<>(Products.class);
        grid.setItems(productsListService.getProductsList());
        add(grid);
    }


}
