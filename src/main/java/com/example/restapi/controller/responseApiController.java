package com.example.restapi.controller;

import com.example.restapi.model.UserRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
//@Controller
@RequestMapping("/api/v1")
public class responseApiController {

    @GetMapping()
//    @ResponseBody
    public UserRequest user() {
        var user = new UserRequest();

        user.setUserName("김동욱");
        user.setUserAge(20);
        user.setEmail("dong@naver.com");

        var response = ResponseEntity.status(HttpStatus.CREATED).body(user);

        return user;

    }
}
