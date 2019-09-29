package com.machau.grocerygetter.view;

import com.machau.grocerygetter.model.Clients;
import com.machau.grocerygetter.model.Products;
import com.machau.grocerygetter.services.ClientsListService;
import com.machau.grocerygetter.services.ProductsListService;
import com.machau.grocerygetter.services.SalesListService;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesView extends VerticalLayout {

    private SalesListService salesListService;
    private ClientsListService clientsListService;
    private ProductsListService productsListService;

    public SalesView(SalesListService salesListService, ClientsListService clientsListService, ProductsListService productsListService) {
        this.salesListService = salesListService;
        this.clientsListService = clientsListService;
        this.productsListService = productsListService;

        clientSelector();
    }

    private void clientSelector() {
        List<Clients> clientsList = clientsListService.getClientsList();
        ComboBox<Clients> comboBox = new ComboBox<>();
        comboBox.setItems(clientsList);
        comboBox.setItemLabelGenerator(Clients::getFullName);
        comboBox.setLabel("Select client");
        comboBox.addValueChangeListener(e -> {
            Clients client = comboBox.getValue();
            add(new Button(client.getLastName()));

            createNewSale(client);


        });
        add(comboBox);
    }

    private void createNewSale(Clients client) {
        List<Products> productsList = productsListService.getProductsList();
        CreateSaleView createSaleView=new CreateSaleView(client, productsList);
        add(createSaleView);
    }

//    private List<Clients> createClientsList() {
//        List<Clients> clientsList= new ArrayList<>();
//        Iterable<Clients> clientsIterable= clientsRepository.findAll();
//        clientsIterable.forEach(clientsList::add);
//        return clientsList;
//    }
}
