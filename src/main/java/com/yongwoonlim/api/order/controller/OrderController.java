package com.yongwoonlim.api.order.controller;

import com.yongwoonlim.api.order.domain.Order;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @PostMapping
    public void save(Order user) {

    }

    @GetMapping
    public List<Order> findAll() {
        return null;
    }

    @GetMapping("/{id}")
    public Optional<Order> findById(@PathVariable long id) {
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
    public void update(Order user) {

    }

    @DeleteMapping
    public void deleteById(long id) {

    }
}
