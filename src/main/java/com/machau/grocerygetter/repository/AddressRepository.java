package com.machau.grocerygetter.repository;

import com.machau.grocerygetter.model.Address;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AddressRepository extends CrudRepository<Address, Long> {
    public Iterable<Address> findByStreet(String street);

    public Iterable<Address> findByCity(String city);
}
