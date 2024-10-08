package org.example.service;

import org.example.model.User;

public interface UserService {

    /**
     * 查询所有用户
     * @return
     */
    User selectAll(Integer userId);
}
