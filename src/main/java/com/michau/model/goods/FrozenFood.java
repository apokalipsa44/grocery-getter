package com.michau.model.goods;

import com.michau.model.saleSystem.ExpDate;
import com.michau.model.saleSystem.TaxRate;

import javax.persistence.Entity;

@Entity
public class FrozenFood extends Goods {

    private ExpDate expDate;

    public FrozenFood() {
    }

    public FrozenFood(String name, Double price, TaxRate taxRate, Integer stock, ExpDate expDate) {
        super(name, price, taxRate, stock);
        this.expDate = expDate;
    }

    public ExpDate getExpDate() {
        return expDate;
    }

    public void setExpDate(ExpDate expDate) {
        this.expDate = expDate;
    }
}
