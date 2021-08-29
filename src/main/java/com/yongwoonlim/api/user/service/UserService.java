package com.yongwoonlim.api.user.service;

import com.yongwoonlim.api.user.domain.User;
import com.yongwoonlim.api.user.domain.UserDto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
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

    String signup(User user);

    UserDto signin(User user);
}
