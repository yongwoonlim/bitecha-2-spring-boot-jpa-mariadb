package com.yongwoonlim.api.user.service;

import com.yongwoonlim.api.user.domain.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface UserService {
    void save(User user);

    List<User> findAll();

    Optional<User> findById(long id);

    boolean existsById(long id);

    long count();

    void deleteById(long id);
}
