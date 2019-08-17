package com.michau.repository.saleRepository.services;

import com.michau.model.sale.Sale;
import com.michau.repository.saleRepository.SaleRepo;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class SaleService {

    private SaleRepo saleRepo;

    public SaleService(SaleRepo saleRepo) {
        this.saleRepo = saleRepo;
    }

    public Optional<Sale> findById(Long id){
        return saleRepo.findById(id);
    }

    public Iterable<Sale> findAll(){
        return saleRepo.findAll();
    }

    public Iterable<Sale> findByDateOfSale(Date dateOfSale){
        return saleRepo.findByDateOfSale(dateOfSale);
    }
}
//    public Optional<VideoCassete> findById(Long id) {
//        return videoRepo.findById(id);
//    }
//
//    public Iterable<VideoCassete> findAll() {
//        return videoRepo.findAll();