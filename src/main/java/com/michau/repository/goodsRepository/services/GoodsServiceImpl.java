package com.michau.repository.goodsRepository.services;

import com.michau.model.goods.Goods;
import com.michau.repository.goodsRepository.GoodsRepo;

import java.util.Optional;

public class GoodsServiceImpl {

    private GoodsRepo goodsRepo;

    public GoodsServiceImpl(GoodsRepo goodsRepo) {
        this.goodsRepo = goodsRepo;
    }

    public Optional<Goods> findById(Long id) {
        return goodsRepo.findById(id);
    }

    public Iterable<Goods> findAll() {
        return goodsRepo.findAll();
    }

    public Goods save(Goods goods) {
        return goodsRepo.save(goods);
    }

    public Goods update(Goods goods) {
        goodsRepo.deleteById(goods.getId());
        return goodsRepo.save(goods);
    }

    public void deleteById(long id) {
        goodsRepo.deleteById(id);
    }

    public Iterable<Goods> findByName(String name){
        return goodsRepo.findByName(name);
    }

    public Iterable<Goods> findByPrice(Double price){
        return goodsRepo.findByPrice(price);
    }

    public Iterable<Goods> findByStock(int stockNumber){
        return goodsRepo.findByStock(stockNumber);
    }


}
