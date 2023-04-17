package com.example.restapi;

import com.example.restapi.model.UserRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
// 데이터 -> json = 직렬화
@SpringBootTest
class RestApiApplicationTests {

    @Autowired
    private ObjectMapper objectMapper;


    @Test
    void contextLoads() throws JsonProcessingException {
        var user = new UserRequest("김동욱", 10, "dong@naver.com", true);
        System.out.println(user);
//        user.setUserName("김동욱");
//        user.setUserAge(10);
//        user.setEmail("test@naver.com");
//        user.setIsKorean(true);

        var json = objectMapper.writeValueAsString(user);
        System.out.println(json);

        var dto = objectMapper.readValue(json, UserRequest.class);
        System.out.println(dto);
    }

}
