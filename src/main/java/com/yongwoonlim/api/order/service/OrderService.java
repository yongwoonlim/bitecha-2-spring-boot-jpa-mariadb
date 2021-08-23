package com.yongwoonlim.api.order.service;

import com.yongwoonlim.api.order.domain.Order;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface OrderService {
    void save(Order order);

    List<Order> findAll();

    Optional<Order> findById(long id);

    boolean existsById(long id);

    long count();

    void deleteById(long id);
}
