import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-tabs/src/vaadin-tabs.js';
import '@vaadin/vaadin-tabs/src/vaadin-tab.js';

class TopMenu extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                   :host {
                        display: block;
                        box-shadow: 0 0 16px 2px var(--lumo-shade-20pct);
                        z-index: 200;
                        --iron-icon-width: 16px;
                      }
                      .toolbar {
                        display: flex;
                        justify-content: center;
                        background-color: var(--lumo-base-color);
                        align-items: center;
                        position: relative;
                      }
                      vaadin-tab {
                        font-size: var(--lumo-font-size-xs);
                        padding-left: .75em;
                        padding-right: .75em;
                      }
                      vaadin-tabs {
                        overflow: hidden;
                      }
                      .branding {
                        display: none;
                      }
                      .navigation-tabs a {
                        text-decoration: none;
                      }
                      @media (min-width: 600px) {
                        vaadin-tab {
                          font-size: var(--lumo-font-size-m);
                          padding-left: 1em;
                          padding-right: 1em;
                        }
                      }
                      @media (min-width: 1000px) {
                        .branding {
                          display: block;
                          font-size: var(--lumo-font-size-m);
                          line-height: normal;
                          position: absolute;
                          left: 0;
                          padding-left: var(--lumo-space-m);
                        }
                      }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;align-self:center;justify-content:center;">
 <vaadin-tabs theme="align-self:center;">
  <vaadin-tab>
    list of products 
  </vaadin-tab>
  <vaadin-tab>
    new delivery 
  </vaadin-tab>
  <vaadin-tab>
    sales 
  </vaadin-tab>
 </vaadin-tabs>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'top-menu';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(TopMenu.is, TopMenu);


