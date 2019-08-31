package com.michau.model.sale;

import java.util.Date;


public class ExpDate {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Temporal(TemporalType.DATE)
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
