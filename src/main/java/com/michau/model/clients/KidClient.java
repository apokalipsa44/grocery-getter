package com.michau.model.clients;

import javax.persistence.Entity;

@Entity
public class KidClient extends Client {

    public KidClient() {
    }

    public KidClient(String name, String lastName) {
        super(name, lastName);
    }
}
