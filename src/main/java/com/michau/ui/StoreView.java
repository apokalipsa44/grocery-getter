package com.michau.ui;

import com.vaadin.flow.router.Route;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the store-view template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Route("store-view")
@Tag("store-view")
@JsModule("./store-view.js")
public class StoreView extends PolymerTemplate<StoreView.StoreViewModel> {

    /**
     * Creates a new StoreView.
     */
    public StoreView() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between StoreView and store-view
     */
    public interface StoreViewModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
