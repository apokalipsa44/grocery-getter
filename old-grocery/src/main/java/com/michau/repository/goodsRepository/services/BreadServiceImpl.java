package com.michau.repository.goodsRepository.services;

import com.michau.repository.goodsRepository.BreadRepo;
import com.michau.repository.goodsRepository.GoodsRepo;

public class BreadServiceImpl extends GoodsServiceImpl {

    private BreadRepo  breadRepo;

    public BreadServiceImpl(GoodsRepo goodsRepo, BreadRepo breadRepo) {
        super(goodsRepo);
        this.breadRepo = breadRepo;
    }
}
