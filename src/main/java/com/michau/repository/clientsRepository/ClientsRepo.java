package com.michau.repository.clientsRepository;

import com.michau.model.clients.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ClientsRepo extends CrudRepository<Client, Long> {

    public Optional<Client> findByName(String name);

    public Optional<Client> findByLastName(String lastName);
}
