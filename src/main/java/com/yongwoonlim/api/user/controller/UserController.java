package com.yongwoonlim.api.user.controller;

import com.yongwoonlim.api.user.domain.User;
import com.yongwoonlim.api.user.domain.UserDto;
import com.yongwoonlim.api.user.service.UserService;
import io.swagger.annotations.*;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@Api(tags = "users")
@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    private final ModelMapper modelMapper;

    @PostMapping("/signup")
    @ApiOperation(value = "{UserController.signup}")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "something wrong"),
            @ApiResponse(code = 403, message = "승인거절"),
            @ApiResponse(code = 422, message = "중복된 사용자 이름")
    })
    public ResponseEntity<String> signup(@ApiParam("Signup User")
                                         @RequestBody UserDto userDto) {
        return ResponseEntity.ok(userService.signup(modelMapper.map(userDto, User.class)));
    }

    @PostMapping("/signin")
    @ApiOperation(value = "{UserController.signin}")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "something wrong"),
            @ApiResponse(code = 422, message = "유효하지 않은 정보")
    })
    public ResponseEntity<UserDto> signin(@ApiParam("Signin User")
                                         @RequestBody UserDto userDto) {
        return ResponseEntity.ok(userService.signin(modelMapper.map(userDto, User.class)));
    }


    @PostMapping
    public void save(@RequestBody User user) {
        userService.save(user);
    }

    @GetMapping
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable long id) {
        return userService.findById(id);
    }

    @GetMapping("/exists/{id}")
    public boolean existsById(@PathVariable long id) {
        return userService.existsById(id);
    }

    @GetMapping("/count")
    public long count() {
        return userService.count();
    }

    @PutMapping
    public void update(@RequestBody User user) {
        userService.save(user);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id) {
        userService.deleteById(id);
    }
}
