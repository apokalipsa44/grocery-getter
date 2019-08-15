package com.michau.model.goods;

import com.michau.model.goods.Goods;
import com.michau.model.saleSystem.TaxRate;

import javax.persistence.Entity;

@Entity
public class Tabacco extends Goods {

    public Tabacco() {
    }

    public Tabacco(String name, Double price, TaxRate taxRate, Integer stock) {
        super(name, price, taxRate, stock);
    }
}
