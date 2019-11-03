package com.michau.model.goods;

import com.michau.model.Store;
import com.michau.model.sale.Sale;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Goods {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double price;

    private Double taxRate;

    private Integer stock;

    private GoodsType goodsType;

    @ManyToOne
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Store store;

    @ManyToOne
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Sale sale;

    public Goods() {
    }

    public Goods(String name, Double price, Double taxRate, Integer stock, GoodsType goodsType) {
        this.name = name;
        this.price = price;
        this.taxRate = taxRate;
        this.stock = stock;
        this.goodsType = goodsType;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }
}
