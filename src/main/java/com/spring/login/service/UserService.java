package com.spring.login.service;

import com.spring.login.model.User;

public interface UserService {

    public void save(User user);
    public User findByUsername(String username);
}
