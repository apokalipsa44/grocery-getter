package com.michau.ui;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the admin-panel template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("admin-panel")
@JsModule("./admin-panel.js")
public class AdminPanel extends PolymerTemplate<AdminPanel.AdminPanelModel> {

    /**
     * Creates a new AdminPanel.
     */
    public AdminPanel() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between AdminPanel and admin-panel
     */
    public interface AdminPanelModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
