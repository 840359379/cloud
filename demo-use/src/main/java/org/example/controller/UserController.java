package org.example.controller;

import jakarta.annotation.Resource;
import org.example.client.UserClient;
import org.example.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Resource
    private UserClient userClient;

    @GetMapping(value = "/consumer/user/select")
    public User test(User user) {
        return userClient.selectAll(user);
    }

}
