package com.yongwoonlim.api;

import com.yongwoonlim.api.item.domain.Item;
import com.yongwoonlim.api.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ItemApplication /*implements CommandLineRunner*/ {

   /* @Autowired
    private ItemService itemService;*/

    public static void main(String[] args) {
        SpringApplication.run(ItemApplication.class, args);
    }

    /*@Override
    public void run(String... args) {
        //itemService.deleteAll();
        itemService.save(new Item("삼성", "갤럭시 2", "흑색"));
        itemService.save(new Item("애플", "아이폰 3", "흰색"));
        itemService.save(new Item("샤오미", "홍미 3", "적색"));
        for (Item item : itemService.findAll()) {
            System.out.println(item);
        }
    }*/
}
