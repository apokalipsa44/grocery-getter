package com.machau.grocerygetter.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Clients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String lastName;

    @OneToOne
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Address address;

    private String phone;

//    @OneToMany
//    private List<Sales> salesList;

    public Clients(String name, String lastName, Address address, String phone) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
    }

    public String getFullName(){
        return this.name+" "+this.lastName;
    }
}
