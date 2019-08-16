package com.michau.model.goods;

import com.michau.model.goods.Goods;
import com.michau.model.saleSystem.ExpDate;
import com.michau.model.saleSystem.TaxRate;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;


@Entity
public class OtherFoodProducts extends Goods {

    @Temporal(TemporalType.DATE)
    private Date expDate;

    public OtherFoodProducts() {
    }

    public OtherFoodProducts(String name, Double price, Double taxRate, Integer stock, Date expDate) {
        super(name, price, taxRate, stock);
        this.expDate = expDate;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }
}
