package com.michau.repository.clientsRepository.services;

import com.michau.model.clients.Client;
import com.michau.repository.clientsRepository.ClientsRepo;

import java.util.Optional;

public class ClientsServiceImpl {
    private ClientsRepo clientsRepo;

    public ClientsServiceImpl(ClientsRepo clientsRepo) {
        this.clientsRepo = clientsRepo;
    }

    public Iterable<Client> findByName(String  name){
        return clientsRepo.findByName(name);
    }

    public Iterable<Client> findByLastName(String lastName){
        return clientsRepo.findByLastName(lastName);
    }

    public Iterable<Client> findAll(){
        return clientsRepo.findAll();
    }

    public Optional<Client> findById(Long id){
        return clientsRepo.findById(id);
    }
}
