package com.example.validation.annotation;

import com.example.validation.validator.PhoneNumberValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {PhoneNumberValidator.class})
public @interface PhoneNumber {

    String message() default "핸드폰 번호 양식에 맞지 않습니다. ex) 000-0000-0000";

    String regexp() default "^01(?:0|1|[6-9])-(\\d{3}|\\d{4})-(\\d{4})$";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };


}
