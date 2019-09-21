package com.michau.repository.saleRepository.services;

import com.michau.model.sale.Sale;
import com.michau.repository.saleRepository.SaleRepo;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class SaleServiceImpl {

    private SaleRepo saleRepo;

    public SaleServiceImpl(SaleRepo saleRepo) {
        this.saleRepo = saleRepo;
    }

    public Optional<Sale> findById(Long id) {
        return saleRepo.findById(id);
    }

    public Iterable<Sale> findAll() {
        return saleRepo.findAll();
    }

    public Iterable<Sale> findByDateOfSale(Date dateOfSale) {
        return saleRepo.findByDateOfSale(dateOfSale);
    }

    public Iterable<Sale> findByClientName(String name) {
        return saleRepo.findByClientName(name);
    }

    public Iterable<Sale> findByClientLastName(String lastName) {
        return saleRepo.findByClientLastName(lastName);
    }

    public Sale save(Sale sale){
        return saleRepo.save(sale);
    }

    public Sale update(Sale sale){
        saleRepo.deleteById(sale.getId());
        return saleRepo.save(sale);
    }

    public void deleteById(long id){
        saleRepo.deleteById(id);
    }
}
