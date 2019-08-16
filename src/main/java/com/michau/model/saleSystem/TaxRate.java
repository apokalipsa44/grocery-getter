package com.michau.model.saleSystem;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class TaxRate {

    private final double TAX_RATE_5 = 0.5;
    private final double TAX_RATE_8 = 0.8;
    private final double TAX_RATE_23 = 0.23;


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
