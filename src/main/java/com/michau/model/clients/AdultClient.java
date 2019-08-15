package com.michau.model.clients;

import javax.persistence.Entity;

@Entity
public class AdultClient extends Client {

    public AdultClient() {
    }

    public AdultClient(String name, String lastName) {
        super(name, lastName);
    }
}
