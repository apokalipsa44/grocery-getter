package com.michau.repository.goodsRepository.services;

import com.michau.repository.goodsRepository.GoodsRepo;
import com.michau.repository.goodsRepository.TabaccoRepo;
import com.michau.repository.goodsRepository.services.GoodsServiceImpl;

public class TabaccoServiceImpl extends GoodsServiceImpl {
    private TabaccoRepo tabaccoRepo;

    public TabaccoServiceImpl(GoodsRepo goodsRepo, TabaccoRepo tabaccoRepo) {
        super(goodsRepo);
        this.tabaccoRepo = tabaccoRepo;
    }

}
