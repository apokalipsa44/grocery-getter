package com.michau.model.saleSystem;

import com.michau.model.Store;
import com.michau.model.clients.Client;
import com.michau.model.goods.Goods;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date dateOfSale;

    @OneToOne
    private Client client;

    @OneToMany
    private List<Goods> goods;

    private Double totalPrice;

    @ManyToOne
    private Store store;

    public Sale() {
    }

    public Sale(Date dateOfSale, Client client, List<Goods> goods, Double totalPrice) {
        this.dateOfSale = dateOfSale;
        this.client = client;
        this.goods = goods;
        this.totalPrice = totalPrice;
    }

    public Long getId() {
        return id;
    }

    public Date getDateOfSale() {
        return dateOfSale;
    }

    public void setDateOfSale(Date dateOfSale) {
        this.dateOfSale = dateOfSale;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Goods> getGoods() {
        return goods;
    }

    public void setGoods(List<Goods> goods) {
        this.goods = goods;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }
}
