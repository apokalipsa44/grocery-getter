package com.michau.model.goods;

import com.michau.model.saleSystem.RecyclablePackaging;
import com.michau.model.saleSystem.TaxRate;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Alcohol extends Goods {

//    @Column(precision = 5, scale = 2, columnDefinition = "DECIMAL(7,3)")
//    private RecyclablePackaging recyclablePackaging;

    public Alcohol() {
    }

    public Alcohol(String name, Double price, Double taxRate, Integer stock) {
        super(name, price, taxRate, stock);

    }

//    public RecyclablePackaging getRecyclablePackaging() {
//        return recyclablePackaging;
//    }
//
//    public void setRecyclablePackaging(RecyclablePackaging recyclablePackaging) {
//        this.recyclablePackaging = recyclablePackaging;
//    }
}
