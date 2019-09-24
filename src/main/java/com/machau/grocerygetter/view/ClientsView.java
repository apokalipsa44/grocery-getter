package com.machau.grocerygetter.view;

import com.machau.grocerygetter.model.Clients;
import com.machau.grocerygetter.services.ClientsListService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientsView extends VerticalLayout {

    ClientsListService clientsListService;

    @Autowired
    public ClientsView(ClientsListService clientsListService) {
        this.clientsListService = clientsListService;

        addGrid();
    }

    private void addGrid(){
        Grid<Clients> clientsGrid=new Grid<>(Clients.class);
        clientsGrid.setItems(clientsListService.getClientsList());
        add(clientsGrid);
    }
}
