package com.michau.model.clients;

import javax.persistence.Entity;

@Entity
public class StoreEmployee extends Client {

    private final Double EMPLOYEE_DISCOUNT=0.5;

    public StoreEmployee() {
    }

    public StoreEmployee(String name, String lastName) {
        super(name, lastName);
    }

    public Double getEMPLOYEE_DISCOUNT() {
        return EMPLOYEE_DISCOUNT;
    }
}
