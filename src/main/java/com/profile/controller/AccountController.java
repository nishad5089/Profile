package com.profile.controller;

import com.authmodule.commons.model.Users;
import com.authmodule.commons.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    final UserService userService;

    public AccountController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ResponseEntity<?> createUser(@RequestBody Users user) {
        return ResponseEntity.ok(userService.createUser(user));
    }
}
