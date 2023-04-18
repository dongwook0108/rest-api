package com.example.validation.annotation;

import com.example.validation.validator.YearMonthValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotBlank;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {YearMonthValidator.class})
@NotBlank
public @interface YearMonth {

    String message() default "year month 양식에 맞지 않습니다. ex) 20230101";

    String pattern() default "yyyyMMdd";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};


}
