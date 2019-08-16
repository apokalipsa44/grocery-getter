package com.michau.repository.goodsRepository;

import com.michau.model.goods.Meats;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.Optional;

public interface MeatsRepo extends CrudRepository<Meats, Long> {
    public Optional<Meats> findByExpDate(Date expDate);
}
