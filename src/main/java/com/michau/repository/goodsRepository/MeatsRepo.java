package com.michau.repository.goodsRepository;

import com.michau.model.goods.Meats;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;

public interface MeatsRepo extends CrudRepository<Meats, Long> {
    public Iterable<Meats> findByExpDate(Date expDate);
}
