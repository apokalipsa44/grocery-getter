package com.michau.ui;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the top-menu template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Route(value = "TOP_MENU", layout = TopMenu.class)
@Tag("top-menu")
@JsModule("./top-menu.js")
public class TopMenu extends PolymerTemplate<TopMenu.TopMenuModel> implements RouterLayout {

    /**
     * Creates a new TopMenu.
     */
    public TopMenu() {

    }



    /**
     * This model binds properties between TopMenu and top-menu
     */
    public interface TopMenuModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
