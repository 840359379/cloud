package org.example.controller;


import org.example.model.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserSerController {

    @Autowired
    private UserService userService;

    @RequestMapping("/openFeign/user/select")
    public User selectAll(User user)  {
        return userService.selectAll(user.getUserId());
    }

}
