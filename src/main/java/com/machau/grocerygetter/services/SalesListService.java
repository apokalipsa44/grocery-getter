package com.machau.grocerygetter.services;

import com.machau.grocerygetter.repository.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalesListService {

    SalesRepository salesRepository;

    @Autowired
    public SalesListService(SalesRepository salesRepository) {
        this.salesRepository = salesRepository;
    }
}
