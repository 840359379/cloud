package org.example.service.Impl;

import org.example.mapper.UserMapper;
import org.example.model.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectAll(Integer userId) {
        return userMapper.selectAll(userId);
    }
}
