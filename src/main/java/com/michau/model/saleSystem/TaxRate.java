package com.michau.model.saleSystem;

import javax.persistence.Entity;

@Entity
public final class TaxRate {
    public final double TAX_RATE_5 = 0.5;
    public final double TAX_RATE_8 = 0.8;
    public final double TAX_RATE_23 = 0.23;


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
