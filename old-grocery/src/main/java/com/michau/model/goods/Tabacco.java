package com.michau.model.goods;

import javax.persistence.Entity;

@Entity
public class Tabacco extends Goods {

    public Tabacco() {
    }

    public Tabacco(String name, Double price, Double taxRate, Integer stock, GoodsType goodsType) {
        super(name, price, taxRate, stock, GoodsType.TABACCO);
    }
}
