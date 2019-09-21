package com.michau.repository.goodsRepository.services;

import com.michau.model.goods.MilkProducts;
import com.michau.repository.goodsRepository.GoodsRepo;
import com.michau.repository.goodsRepository.MilkProductsRepo;

import java.util.Date;

public class MilkProductsServiceImpl extends GoodsServiceImpl {
    private MilkProductsRepo milkProductsRepo;

    public MilkProductsServiceImpl(GoodsRepo goodsRepo, MilkProductsRepo milkProductsRepo) {
        super(goodsRepo);
        this.milkProductsRepo = milkProductsRepo;
    }

    public Iterable<MilkProducts> findByExpDate(Date expDate){
        return milkProductsRepo.findByExpDate(expDate);
    }
}
