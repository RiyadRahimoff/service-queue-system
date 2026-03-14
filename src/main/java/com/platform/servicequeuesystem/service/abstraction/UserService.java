package com.platform.servicequeuesystem.service.abstraction;

import com.platform.servicequeuesystem.dao.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void createUser(UserEntity userEntity);

    List<UserEntity> getAllUsers();

    Optional<UserEntity> getUserById(Long id);

    Optional<UserEntity> getUserByEmail(String email);

    void deleteUser(Long id);
}
