package com.michau.model.goods;

import javax.persistence.Entity;

@Entity
public class Alcohol extends Goods {

    private Double recycleFee;

    public Alcohol() {
    }

    public Alcohol(String name, Double price, Double taxRate, Integer stock, Double recycleFee, GoodsType goodsType) {
        super(name, price, taxRate, stock, goodsType.ALCOHOL);
        this.recycleFee = recycleFee;
    }

    public Double getRecycleFee() {
        return recycleFee;
    }

    public void setRecycleFee(Double recycleFee) {
        this.recycleFee = recycleFee;
    }
}
