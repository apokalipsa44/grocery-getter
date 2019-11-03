package com.michau.repository.goodsRepository.services;

import com.michau.model.goods.Alcohol;
import com.michau.repository.goodsRepository.AlcoholRepo;
import com.michau.repository.goodsRepository.GoodsRepo;

import java.util.Optional;

public class AlcoholServiceImpl extends GoodsServiceImpl {
    private AlcoholRepo alcoholRepo;

    public AlcoholServiceImpl(GoodsRepo goodsRepo, AlcoholRepo alcoholRepo) {
        super(goodsRepo);
        this.alcoholRepo = alcoholRepo;
    }

    public Optional<Alcohol> findByRecycleFee(double fee){
        return alcoholRepo.findByRecycleFee(fee);
    }
}
