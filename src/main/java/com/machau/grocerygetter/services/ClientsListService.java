package com.machau.grocerygetter.services;

import com.machau.grocerygetter.model.Address;
import com.machau.grocerygetter.model.Clients;
import com.machau.grocerygetter.repository.ClientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientsListService {
    List<Clients> clientsList=new ArrayList<>();

    private ClientsRepository clientsRepository;

    @Autowired
    public ClientsListService(ClientsRepository clientsRepository) {
        this.clientsRepository = clientsRepository;
    }

    public List<Clients> getClientsList(){
        clientsList=clientsListInit();
        Iterable<Clients>  clientsIterable=clientsRepository.findAll();
        clientsIterable.forEach(clientsList::add);
        return clientsList;
    }

    private List<Clients> clientsListInit() {
        clientsList.clear();
        clientsList.add(new Clients("John", "Rambo",
                new Address("Strasse", "27b", "Breslau", "54-548"
        ),"664884824" ));
        clientsList.add(new Clients("Karol", "Strassburger",
                new Address("Ulica", "33", "Breslau", "54-548"
                ),"8494651562" ));
        clientsList.add(new Clients("Maja", "Pszczółka",
                new Address("Strasse", "44", "Breslau", "54-548"
                ),"2288445454" ));
        clientsList.add(new Clients("Albert", "Einstein",
                new Address("Koralowa", "11", "Breslau", "54-515"
                ),"895413216" ));
        clientsList.add(new Clients("Miś", "Uszatek",
                new Address("Długa", "651651m/1", "Breslau", "54-333"
                ),"648254542" ));

        return clientsList;
    }
}
