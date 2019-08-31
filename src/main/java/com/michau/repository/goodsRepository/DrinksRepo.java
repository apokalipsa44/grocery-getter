package com.michau.repository.goodsRepository;


import com.michau.model.goods.Drinks;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;

public interface DrinksRepo extends CrudRepository<Drinks, Long> {
    public Iterable<Drinks> findByExpDate(Date expDate);
}
