package org.example.controller;

import org.example.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("landing")
public class LandingController {

    @RequestMapping("verification")
    @ResponseBody
    public User verification(User user) {
        return new User();
    }

}
