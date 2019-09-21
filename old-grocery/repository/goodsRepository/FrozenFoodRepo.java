package com.michau.repository.goodsRepository;

import com.michau.model.goods.FrozenFood;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.Optional;

public interface FrozenFoodRepo extends CrudRepository<FrozenFood, Long> {
    public Iterable<FrozenFood> findByExpDate(Date expDte);
}
