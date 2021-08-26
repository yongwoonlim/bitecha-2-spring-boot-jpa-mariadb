package com.yongwoonlim.api.item.service;

import com.yongwoonlim.api.item.domain.Item;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface ItemService {
    void save(Item item);

    List<Item> findAll();

    Optional<Item> findById(long id);

    boolean existsById(long id);

    long count();

    void deleteById(long id);

    void deleteAll();
}
