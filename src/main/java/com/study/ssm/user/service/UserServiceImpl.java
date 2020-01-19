package com.study.ssm.user.service;


import com.study.ssm.Util.MailTool;
import com.study.ssm.user.dao.UserDao;
import com.study.ssm.user.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import javax.mail.MessagingException;

@Service("userService")
public class UserServiceImpl implements UserService{
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    UserDao userDao;

    public User login(String name) {
        try {
            return userDao.login(name);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

}

    public int register(User user) {
        return userDao.register(user);
    }

    @Override
    public String getEmailKey(String email) {
        try {
            int key = MailTool.getEmailKey(email);
            return key+"";
        } catch (MessagingException e) {
            return null;
        }
    }

}
