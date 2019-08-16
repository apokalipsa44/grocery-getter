package com.michau.repository.goodsRepository;


import com.michau.model.goods.Drinks;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface DrinksRepo extends CrudRepository<Drinks, Long> {
    public Optional<Drinks> findByExpDate(Double expDate);
}
