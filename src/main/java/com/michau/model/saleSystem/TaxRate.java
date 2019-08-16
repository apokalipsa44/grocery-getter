package com.michau.model.saleSystem;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TaxRate {
//    TAX_RATE_5,
//    TAX_RATE_8,
//    TAX_RATE_23


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private final double TAX_RATE_5 = 0.5;
    private final double TAX_RATE_8 = 0.8;
    private final double TAX_RATE_23 = 0.23;


    public TaxRate() {
    }

    public double getTAX_RATE_5() {
        return TAX_RATE_5;
    }

    public double getTAX_RATE_8() {
        return TAX_RATE_8;
    }

    public double getTAX_RATE_23() {
        return TAX_RATE_23;
    }
}
