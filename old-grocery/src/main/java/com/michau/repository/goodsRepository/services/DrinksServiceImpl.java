package com.michau.repository.goodsRepository.services;

import com.michau.model.goods.Drinks;
import com.michau.repository.goodsRepository.DrinksRepo;
import com.michau.repository.goodsRepository.GoodsRepo;

import java.util.Date;


public class DrinksServiceImpl extends GoodsServiceImpl {

    private DrinksRepo drinksRepo;

    public DrinksServiceImpl(GoodsRepo goodsRepo, DrinksRepo drinksRepo) {
        super(goodsRepo);
        this.drinksRepo = drinksRepo;
    }

    public Iterable<Drinks> findByExpDate(Date expDate){
        return drinksRepo.findByExpDate(expDate);
    }
}
