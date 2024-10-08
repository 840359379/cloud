package org.example.client;

import org.example.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "demo-service")
public interface UserClient {

    @RequestMapping("/openFeign/user/select")
    User selectAll(User user);

}
