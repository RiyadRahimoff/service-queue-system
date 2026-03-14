package com.platform.servicequeuesystem.controller;

import com.platform.servicequeuesystem.dao.entity.UserEntity;
import com.platform.servicequeuesystem.service.concrete.UserServiceHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserServiceHandler userServiceHandler;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@RequestBody UserEntity userEntity) {
        userServiceHandler.createUser(userEntity);
    }
}
