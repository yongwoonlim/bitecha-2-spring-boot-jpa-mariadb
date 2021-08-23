package com.yongwoonlim.api.item.controller;

import com.yongwoonlim.api.item.domain.Item;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/items")
public class ItemController {
    @PostMapping
    public void save(Item user) {

    }

    @GetMapping
    public List<Item> findAll() {
        return null;
    }

    @GetMapping("/{id}")
    public Optional<Item> findById(@PathVariable long id) {
        return Optional.empty();
    }

    @GetMapping("/exists/{id}")
    public boolean existsById(@PathVariable long id) {
        return false;
    }

    @GetMapping("/count")
    public long count() {
        return 0;
    }

    @PutMapping
    public void update(Item user) {

    }

    @DeleteMapping
    public void deleteById(long id) {

    }
}
