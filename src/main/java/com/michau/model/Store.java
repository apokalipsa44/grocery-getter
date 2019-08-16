package com.michau.model;

import com.michau.model.clients.Client;
import com.michau.model.clients.StoreEmployee;
import com.michau.model.goods.Goods;
import com.michau.model.saleSystem.Sale;

import javax.persistence.*;
import java.util.List;

@Entity
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @OneToMany
    private List<Goods> goodsList;

    @OneToMany
    private List<Sale> saleList;

    @OneToMany
    private List<StoreEmployee> employeeList;

    @OneToMany
    private List<Client> clientList;

    public Store() {
    }

    public Store(List<Goods> goodsList, List<Sale> saleList) {
        this.goodsList = goodsList;
        this.saleList = saleList;
    }

    public Long getId() {
        return id;
    }


    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    public List<Sale> getSaleList() {
        return saleList;
    }

    public void setSaleList(List<Sale> saleList) {
        this.saleList = saleList;
    }

    public List<StoreEmployee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<StoreEmployee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }
}
