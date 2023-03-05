package com.example.registrationlogindemo.service;

import com.example.registrationlogindemo.dto.UserDto;
import com.example.registrationlogindemo.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(Object object);

    List<UserDto> findAllUsers();

	User findByEmail1(Object email);

	User findByEmail(String email);
}
