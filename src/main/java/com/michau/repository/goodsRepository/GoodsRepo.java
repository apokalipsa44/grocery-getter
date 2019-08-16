package com.michau.repository.goodsRepository;

import com.michau.model.goods.Goods;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface GoodsRepo extends CrudRepository<Goods, Long> {

    public Optional<Goods> findByName(String name);

    public Optional<Goods> findByPrice(Double price);

    public Optional<Goods> findByStock(int stockNumber);
}
