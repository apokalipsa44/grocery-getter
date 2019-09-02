package com.michau.ui;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the main-view template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Route("main-view")
@Tag("main-view")
@JsModule("./main-view.js")
public class MainView extends PolymerTemplate<MainView.MainViewModel>   {

    /**
     * Creates a new MainView.
     */
    public MainView() {
        Div topMenu=new Div();
        topMenu.add(new RouterLink("top-menu", TopMenu.class));


    }

    /**
     * This model binds properties between MainView and main-view
     */
    public interface MainViewModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
