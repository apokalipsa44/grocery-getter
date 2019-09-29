package com.machau.grocerygetter.view;

import com.machau.grocerygetter.model.Clients;
import com.machau.grocerygetter.model.Products;
import com.machau.grocerygetter.model.Sales;
import com.machau.grocerygetter.services.ProductsListService;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.listbox.ListBox;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public class CreateSaleView extends VerticalLayout {
//    private List<Products> productsList = new ArrayList<>();


    public CreateSaleView(Clients client, List<Products> productsList) {
        Sales sale = new Sales();
        sale.setClients(client);
        createProductSelector(productsList);
    }

    private void createProductSelector(List<Products> productsList) {
        ListBox<Products> listBox = new ListBox<>();
        listBox.setItems(productsList);
       add(listBox);
    }
}
