package com.machau.grocerygetter.view;

import com.machau.grocerygetter.services.SalesListService;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class SalesView extends VerticalLayout {

    private SalesListService salesListService;

    public SalesView(SalesListService salesListService) {
        this.salesListService = salesListService;

        
    }
}
