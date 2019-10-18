package com.learn.upload_file.service;

import com.learn.upload_file.dao.UserDao;
import com.learn.upload_file.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDaoService {
    @Autowired
    private UserDao userDao;

    public List<User> selectAll () {
        List<User> users = new ArrayList<>();
        users = userDao.selectAll();
        return users;
    }
}
