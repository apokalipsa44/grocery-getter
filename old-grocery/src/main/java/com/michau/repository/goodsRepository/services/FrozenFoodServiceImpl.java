package com.michau.repository.goodsRepository.services;

import com.michau.model.goods.FrozenFood;
import com.michau.repository.goodsRepository.FrozenFoodRepo;
import com.michau.repository.goodsRepository.GoodsRepo;

import java.util.Date;

public class FrozenFoodServiceImpl extends GoodsServiceImpl {

    private FrozenFoodRepo frozenFoodRepo;

    public FrozenFoodServiceImpl(GoodsRepo goodsRepo, FrozenFoodRepo frozenFoodRepo) {
        super(goodsRepo);
        this.frozenFoodRepo = frozenFoodRepo;
    }

    public Iterable<FrozenFood> findByExpDate(Date expDate){
        return frozenFoodRepo.findByExpDate(expDate);
    }
}
