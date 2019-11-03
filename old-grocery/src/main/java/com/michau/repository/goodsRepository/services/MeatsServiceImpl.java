package com.michau.repository.goodsRepository.services;

import com.michau.model.goods.Meats;
import com.michau.repository.goodsRepository.GoodsRepo;
import com.michau.repository.goodsRepository.MeatsRepo;
import com.michau.repository.goodsRepository.services.GoodsServiceImpl;

import java.util.Date;

public class MeatsServiceImpl extends GoodsServiceImpl {

    private MeatsRepo meatsRepo;

    public MeatsServiceImpl(GoodsRepo goodsRepo, MeatsRepo meatsRepo) {
        super(goodsRepo);
        this.meatsRepo = meatsRepo;
    }

    public Iterable<Meats> findByExpDate(Date expDate){
        return  meatsRepo.findByExpDate(expDate);
    }
}
