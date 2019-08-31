package com.michau.repository.goodsRepository;

import com.michau.model.goods.Bread;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface BreadRepo extends CrudRepository<Bread, Long> {
    public Optional<Bread> findByExpDate(Double expDate);
}
