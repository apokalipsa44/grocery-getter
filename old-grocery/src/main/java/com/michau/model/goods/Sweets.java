package com.michau.model.goods;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
public class Sweets extends Goods {

    @Temporal(TemporalType.DATE)
    private Date expDate;

    public Sweets() {
    }

    public Sweets(String name, Double price, Double taxRate, Integer stock, Date expDate, GoodsType goodsType) {
        super(name, price, taxRate, stock, GoodsType.SWEETS);
        this.expDate = expDate;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }
}
