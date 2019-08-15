package com.michau.model.goods;

import com.michau.model.saleSystem.TaxRate;

import javax.persistence.Entity;

@Entity
public class CleaningSupplies extends Goods {

    public CleaningSupplies() {
    }

    public CleaningSupplies(String name, Double price, TaxRate taxRate, Integer stock) {
        super(name, price, taxRate, stock);
    }
}
