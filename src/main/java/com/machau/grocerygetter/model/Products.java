package com.machau.grocerygetter.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double price;

    private Boolean isOnStock;

    private Integer stock;

    private ProductsType productsType;

    private Date expDate;// todo if expDate is near end price -50%

    @ManyToMany
    private List<Sales> sales;

    public Products(String name, Double price , ProductsType productsType, Date expDate) {
        this.name = name;
        this.price=price;
        this.productsType = productsType;
        this.expDate = expDate;
    }
}
