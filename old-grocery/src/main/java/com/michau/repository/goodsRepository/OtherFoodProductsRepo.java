package com.michau.repository.goodsRepository;

import com.michau.model.goods.OtherFoodProducts;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.Optional;

public interface OtherFoodProductsRepo extends CrudRepository<OtherFoodProducts, Long> {

    public Optional<OtherFoodProducts>findByExpDate(Date expDate);
}
