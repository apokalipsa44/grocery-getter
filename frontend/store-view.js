import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

class StoreView extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                }
            </style>
<h1>store</h1>
`;
    }

    static get is() {
        return 'store-view';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(StoreView.is, StoreView);
