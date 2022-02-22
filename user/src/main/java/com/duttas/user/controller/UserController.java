package com.duttas.user.controller;

import com.duttas.user.VO.ResponseTemplateVO;
import com.duttas.user.entity.User;
import com.duttas.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") long userId) {
        return userService.getUserWithDepartment(userId);
    }
}
