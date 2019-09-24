package com.machau.grocerygetter.view;

import com.machau.grocerygetter.repository.ProductsRepository;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.StreamResource;

import java.util.HashMap;
import java.util.Map;

@Route("grocery")
public class MainView extends AppLayout {

    private Map<Tab, Component> tabComponentMap = new HashMap<>();



    public MainView() {
        setContent(new Label("ssij"));

        Image image = new Image("frontend/images/logo.png", "logo");
        image.setHeight("150px");

        addToNavbar(new DrawerToggle());

        final Tabs tabs = new Tabs(products(), clients(), sales());
        tabs.setOrientation(Tabs.Orientation.VERTICAL);
        tabs.addSelectedChangeListener(event -> {
            final Tab selectedTab = event.getSelectedTab();             // wybiera dla każdego wybranego
            final Component component = tabComponentMap.get(selectedTab); // jego komponent (ramkę) z mapy
            setContent(component);
        });
        addToDrawer(tabs, image);
    }

    private Tab sales() {
        final Span label = new Span("Sales");
        final Icon icon = VaadinIcon.FILE_TABLE.create();
        final Tab tab = new Tab(new HorizontalLayout(icon, label));
        tabComponentMap.put(tab, new SalesView());
        return tab;
    }

    private Tab clients() {
        final Span label = new Span("Clients");
        final Icon icon = VaadinIcon.USERS.create();
        final Tab tab = new Tab(new HorizontalLayout(icon, label));
        tabComponentMap.put(tab, new ClientsView());
        return tab;
    }

    private Tab products() {
        final Span label = new Span("Products");
        final Icon icon = VaadinIcon.STORAGE.create();
        final Tab tab = new Tab(new HorizontalLayout(icon, label));
        tabComponentMap.put(tab, new ProductsView());
        return tab;
    }
}
