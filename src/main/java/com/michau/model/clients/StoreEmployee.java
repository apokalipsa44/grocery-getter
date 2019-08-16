package com.michau.model.clients;

import com.michau.model.Store;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class StoreEmployee extends Client {

    private final Double EMPLOYEE_DISCOUNT=0.5;

    @ManyToOne
    private Store store;

    public StoreEmployee() {
    }

    public StoreEmployee(String name, String lastName) {
        super(name, lastName);
    }

    public Double getEMPLOYEE_DISCOUNT() {
        return EMPLOYEE_DISCOUNT;
    }
}
