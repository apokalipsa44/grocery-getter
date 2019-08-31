package com.michau.repository.saleRepository;

import com.michau.model.sale.Sale;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface SaleRepo extends CrudRepository<Sale, Long> {

    public Iterable<Sale> findByDateOfSale(Date dateOfSale);

    public Iterable<Sale> findByClientName(String name);

    public Iterable<Sale> findByClientLastName(String lastName);

    //todo findByPriceRange

}
