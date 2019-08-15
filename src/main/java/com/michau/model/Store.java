package com.michau.model;

import com.michau.model.goods.Goods;
import com.michau.model.saleSystem.Sale;

import javax.persistence.Entity;

@Entity
public class Store {

    private Goods goods;

    private Sale sale;
    
}
