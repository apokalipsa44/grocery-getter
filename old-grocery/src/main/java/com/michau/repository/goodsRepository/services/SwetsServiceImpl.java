package com.michau.repository.goodsRepository.services;

import com.michau.model.goods.Sweets;
import com.michau.repository.goodsRepository.GoodsRepo;
import com.michau.repository.goodsRepository.SweetsRepo;
import com.michau.repository.goodsRepository.services.GoodsServiceImpl;

import java.util.Date;

public class SwetsServiceImpl extends GoodsServiceImpl {

    private SweetsRepo sweetsRepo;

    public SwetsServiceImpl(GoodsRepo goodsRepo, SweetsRepo sweetsRepo) {
        super(goodsRepo);
        this.sweetsRepo = sweetsRepo;
    }

    public Iterable<Sweets> findByExpDate(Date expDate){
        return sweetsRepo.findByExpDate(expDate);
    }
}
