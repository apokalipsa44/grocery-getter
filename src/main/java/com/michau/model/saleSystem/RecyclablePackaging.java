package com.michau.model.saleSystem;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RecyclablePackaging {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double recycleFee;

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
