package com.michau.repository.saleRepository;

import com.michau.model.sale.Sale;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface SaleRepo extends CrudRepository<Sale, Long> {

    public List<Optional<Sale>> findByDateOfSale(Date dateOfSale);

    public List<Optional<Sale>> findByClientName(String name);

    public List<Optional<Sale>> findByClientLastName(String lastName);

    //todo findByPriceRange

}
