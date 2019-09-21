package com.michau.UI.views;

import com.michau.model.goods.Goods;
import com.michau.model.goods.GoodsType;
import com.michau.model.goods.Meats;
import com.michau.repository.goodsRepository.services.GoodsServiceImpl;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class ProductsView extends VerticalLayout {
   @Autowired
    private GoodsServiceImpl goodsService;

    public ProductsView() {

        Goods goods=new Meats("salami", 12.11, 0.51, 25, new Date(2019,11,25), GoodsType.MEAT);
        Goods goods1=new Goods("szinken", 47.21, 0.14, 46, GoodsType.MEAT);
        Goods goods2=new Goods("baleron", 33.12, 0.11, 152, GoodsType.MEAT);
        Goods goods3=new Goods("chlebek", 2.15, 0.08, 200, GoodsType.BREAD);

goodsService.save(goods);
goodsService.save(goods1);
goodsService.save(goods2);
goodsService.save(goods3);


        List<Goods> goodsList = new ArrayList<>();
        Iterable<Goods> goodsListIterable = goodsService.findAll();
        while (goodsListIterable.iterator().hasNext()) {
            goodsList.add(goodsListIterable.iterator().next());
        }
        Select<String> select = new Select<>();
        select.setLabel("Select products");
        select.setItems("Bread", "Alcohol", "Drinks", "Cleaning supplies", "Frozen food", "Meat", "Milk products", "Sweets", "Tabacco", "Other products");

        Div value = new Div();
        value.setText("Select a value");
        select.addValueChangeListener(
                event -> value.setText("Selected: " + event.getValue()));

        Grid<Goods> grid = new Grid<>();
        grid.setItems(goodsList);


        add(select, grid);

    }

}
