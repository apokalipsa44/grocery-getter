package com.michau.model.saleSystem;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class ExpDate {

    private Date expDate;

    public ExpDate() {
    }

    public ExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }
}
