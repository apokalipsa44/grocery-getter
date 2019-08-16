package com.michau.repository.goodsRepository;

import com.michau.model.goods.MilkProducts;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.Optional;

public interface MilkProductsRepo extends CrudRepository<MilkProducts, Long> {

    public Optional<MilkProducts> findByExpDate(Date expDate);
}
