package com.yongwoonlim.api.user.controller;

import com.yongwoonlim.api.user.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @PostMapping
    public void save(User user) {

    }

    @GetMapping
    public List<User> findAll() {
        return null;
    }

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable long id) {
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
    public void update(User user) {

    }

    @DeleteMapping
    public void deleteById(long id) {

    }
}
