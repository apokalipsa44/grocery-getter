package com.michau.repository.goodsRepository;

import com.michau.model.goods.MilkProducts;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;

public interface MilkProductsRepo extends CrudRepository<MilkProducts, Long> {

    public Iterable<MilkProducts> findByExpDate(Date expDate);
}
