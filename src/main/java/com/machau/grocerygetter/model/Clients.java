package com.machau.grocerygetter.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
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
    private Adders adders;

    private String phone;

    @OneToMany
    private List<Sales> salesList;

    public Clients(String name, String lastName, Adders adders, String phone) {
        this.name = name;
        this.lastName = lastName;
        this.adders = adders;
        this.phone = phone;
    }
}
