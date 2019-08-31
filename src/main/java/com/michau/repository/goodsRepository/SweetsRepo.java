package com.michau.repository.goodsRepository;

import com.michau.model.goods.Sweets;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;

public interface SweetsRepo extends CrudRepository<Sweets, Long> {

    public Iterable<Sweets> findByExpDate(Date expDate);
}
