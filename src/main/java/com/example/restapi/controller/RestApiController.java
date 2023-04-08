package com.example.restapi.controller;

import com.example.restapi.model.BookQueryParma;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestApiController {

    @GetMapping(path = "/hello")
    public String hello() {
        return "hello spring boot";
    }


    @GetMapping("/echo/{message}/age/{age}/is-man/{isMan}")
    public String echo(
            @PathVariable String message,
            @PathVariable int age,
            @PathVariable boolean isMan
    ) {
        System.out.println("echo message = " + message);
        System.out.println("echo age = " + age);
        System.out.println("echo isMan = " + isMan);
        //TODO 대문자로 변환해서 return -> toUpperCase

        // String 타입의 변수 외에 다른 타입 받아보기
        // Integer, Boolean

        return message + age + isMan;
    }

    @GetMapping("/book")
    public void requestParam(
            @RequestParam String category,
            @RequestParam String issuedYear,
            @RequestParam(name = "issued-month") String issuedMonth,
            @RequestParam String issued_day
    ) {
        System.out.println("category = " + category);
        System.out.println("issuedYear = " + issuedYear);
        System.out.println("issued-month = " + issuedMonth);
        System.out.println("issued_day = " + issued_day);
    }

    @GetMapping("/book2")
    public void requestParamDto(
            BookQueryParma bookQueryParma
    ) {
        System.out.println("category = " + bookQueryParma);
    }

    @GetMapping("/add")
    public void add(
            @RequestParam int num1,
            @RequestParam int num2
    ) {
        System.out.println("num1 + num2 = " + num1 + num2);
        System.out.println("num1 * num2 = " + num1 * num2);
    }


//    @GetMapping("/echo1/{number}")
//    public Integer echo(
//            @PathVariable Integer number
//    ) {
//        System.out.println("echo message = " + number);
//
//        // String 타입의 변수 외에 다른 타입 받아보기
//        // Integer, Boolean
//
//        return number;
//    }
//
//    @GetMapping("/echo2/{trueFalse}")
//    public Boolean echo(
//            @PathVariable Boolean trueFalse
//    ) {
//        System.out.println("echo message = " + trueFalse);
//
//        // String 타입의 변수 외에 다른 타입 받아보기
//        // Integer, Boolean
//
//        return trueFalse;
//    }
}
