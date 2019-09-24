package com.machau.grocerygetter.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
@Getter
@Setter
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue
    private Long id;

    private String street;

    private String houseNumber;

    private String city;

    private String zipCode;

    @OneToOne
    @Cascade(CascadeType.ALL)
    private Clients client;

    public Address(String street, String houseNumber, String city, String zipCode) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.city = city;
        this.zipCode = zipCode;
    }
}
