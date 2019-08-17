package com.michau.repository.goodsRepository;

import com.michau.model.goods.Goods;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface GoodsRepo extends CrudRepository<Goods, Long> {

    public Optional<Goods> findByName(String name);

    public Iterable<Goods> findByPrice(Double price);

    public Iterable<Goods> findByStock(int stockNumber);
}
