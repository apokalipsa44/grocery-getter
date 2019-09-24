package com.machau.grocerygetter.repository;

import com.machau.grocerygetter.model.Clients;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ClientsRepository extends CrudRepository<Clients, Long> {
    public Iterable<Clients> findByName(String name);

    public Iterable<Clients> findByLastName(String lastName);
}
