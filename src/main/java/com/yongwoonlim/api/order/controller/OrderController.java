package com.yongwoonlim.api.order.controller;

import com.yongwoonlim.api.order.domain.Order;
import com.yongwoonlim.api.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;

    @PostMapping
    public void save(@RequestBody Order order) {
        orderService.save(order);
    }

    @GetMapping
    public List<Order> findAll() {
        return orderService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Order> findById(@PathVariable long id) {
        return orderService.findById(id);
    }

    @GetMapping("/exists/{id}")
    public boolean existsById(@PathVariable long id) {
        return orderService.existsById(id);
    }

    @GetMapping("/count")
    public long count() {
        return orderService.count();
    }

    @PutMapping
    public void update(@RequestBody Order user) {
        orderService.save(user);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id) {
        orderService.deleteById(id);
    }
}
