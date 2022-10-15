package com.mesutcalim.aop.interceptor;

import jakarta.interceptor.InterceptorBinding;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@InterceptorBinding
@Inherited
@Target({TYPE, METHOD})
@Retention(RUNTIME)
@Documented
public @interface InterceptorYolKesici {
}
