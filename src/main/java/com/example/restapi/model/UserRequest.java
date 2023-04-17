package com.example.restapi.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

//@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@JsonNaming(PropertyNamingStrategy)
public class UserRequest {

    private String userName;

    private Integer userAge;

    private String email;

    //boolean 기본값 -> false
    private Boolean isKorean;

//    public String name() {
//        return this.userName;
//    }
//
//    public int userAge() {
//        return this.userAge;
//    }


    @Override
    public String toString() {
        return "UserRequest{" +
                "userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", email='" + email + '\'' +
                ", isKorean=" + isKorean +
                '}';
    }
}
