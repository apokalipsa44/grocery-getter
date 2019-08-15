package com.michau.model.saleSystem;

import javax.persistence.Entity;

@Entity
public class RecyclablePackaging {
    private double recycleFee;

    public RecyclablePackaging() {
    }

    public RecyclablePackaging(double recycleFee) {
        this.recycleFee = recycleFee;
    }

    public double getRecycleFee() {
        return recycleFee;
    }

    public void setRecycleFee(double recycleFee) {
        this.recycleFee = recycleFee;
    }
}
