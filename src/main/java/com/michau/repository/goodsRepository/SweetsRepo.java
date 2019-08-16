package com.michau.repository.goodsRepository;

import com.michau.model.goods.Sweets;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.Optional;

public interface SweetsRepo extends CrudRepository<Sweets, Long> {

    public Optional<Sweets> findByExpDate(Date expDate);
}
