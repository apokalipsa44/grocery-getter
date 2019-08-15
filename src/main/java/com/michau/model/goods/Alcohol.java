package com.michau.model.goods;

import com.michau.model.saleSystem.RecyclablePackaging;
import com.michau.model.saleSystem.TaxRate;

import javax.persistence.Entity;

@Entity
public class Alcohol extends Goods {

    private RecyclablePackaging recyclablePackaging;

    public Alcohol() {
    }

    public Alcohol(String name, Double price, TaxRate taxRate, Integer stock, RecyclablePackaging recyclablePackaging) {
        super(name, price, taxRate, stock);
        this.recyclablePackaging = recyclablePackaging;
    }

    public RecyclablePackaging getRecyclablePackaging() {
        return recyclablePackaging;
    }

    public void setRecyclablePackaging(RecyclablePackaging recyclablePackaging) {
        this.recyclablePackaging = recyclablePackaging;
    }
}
