package com.michau.model.goods;

import javax.persistence.Entity;

@Entity
public class CleaningSupplies extends Goods {

    public CleaningSupplies() {
    }

    public CleaningSupplies(String name, Double price, Double taxRate, Integer stock) {
        super(name, price, taxRate, stock);
    }
}
