package com.michau.repository.goodsRepository;

import com.michau.model.goods.Alcohol;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AlcoholRepo extends CrudRepository<Alcohol, Long> {
    public Optional<Alcohol> findByRecycleFee(Double recycleFee);
}
