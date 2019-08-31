package com.michau.repository.goodsRepository.services;

import com.michau.repository.goodsRepository.CleaningSuppliesRepo;
import com.michau.repository.goodsRepository.GoodsRepo;

public class CleaningSuppliesServiceImpl extends GoodsServiceImpl {

    private CleaningSuppliesRepo cleaningSuppliesRepo;

    public CleaningSuppliesServiceImpl(GoodsRepo goodsRepo, CleaningSuppliesRepo cleaningSuppliesRepo) {
        super(goodsRepo);
        this.cleaningSuppliesRepo = cleaningSuppliesRepo;
    }
}
