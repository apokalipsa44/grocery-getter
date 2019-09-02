import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-tabs/src/vaadin-tabs.js';
import '@vaadin/vaadin-tabs/src/vaadin-tab.js';

class AdminPanel extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;"></vaadin-vertical-layout>
<h1 style="align-self:center">admin aanel</h1>
<vaadin-tabs>
 <vaadin-tab>
   manage users 
 </vaadin-tab>
 <vaadin-tab>
   manage clients 
 </vaadin-tab>
 <vaadin-tab>
   sales list 
 </vaadin-tab>
 <vaadin-tab>
  store administration
 </vaadin-tab>
</vaadin-tabs>
`;
    }

    static get is() {
        return 'admin-panel';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(AdminPanel.is, AdminPanel);
