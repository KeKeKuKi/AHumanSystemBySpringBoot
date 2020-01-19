package com.study.ssm.user.service;


import com.study.ssm.user.domain.User;

public interface UserService {
    User login(String name);

    int register(User user);

    String getEmailKey(String email);
}
