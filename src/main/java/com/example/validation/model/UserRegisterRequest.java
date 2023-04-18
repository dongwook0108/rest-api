package com.example.validation.model;

import com.example.validation.annotation.PhoneNumber;
import com.example.validation.annotation.YearMonth;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UserRegisterRequest {

    //    @NotNull -> null 허용 하지 않는다
//        @NotEmpty -> null 허용 하지 않는다 + " " 공백 x
//    @NotBlank // "   " 이거까지 하면 안됨
    private String name;
    private String nickname;

    @NotBlank
    @Size(min = 1, max = 12)
    private String password;

    @NotNull
    @Min(1)
    @Max(100)
    private Integer age;

    @Email
    private String email;

    //@Pattern(regexp = "^01(?:0|1|[6-9])-(\\d{3}|\\d{4})-(\\d{4})$", message = "올바른 전화번호형식이 아닙니다.")
    @PhoneNumber
    private String phoneNumber;

    @FutureOrPresent
    private LocalDateTime registerAt;

    @YearMonth(pattern = "yyyy-MM")
    private String birthdayYearMonth;

    @AssertTrue(message = "name or nickname 은 존재 해여합니다")
    public boolean isNameCheck() {

        if (Objects.nonNull(name) && !name.isBlank()) {
            return true;
        }

        if (Objects.nonNull(name) && !nickname.isBlank()) {
            return true;
        }

        return false;
    }

}
