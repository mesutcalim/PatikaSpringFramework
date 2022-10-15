package com.mesutcalim.aop.interceptor;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.extern.java.Log;

import java.io.Serializable;

@Named(value = "aopInterceptor")
@ApplicationScoped
public class AopBean implements Serializable {
    private static final Long serialVersionUID = 1L;

    @Inject
    private Login login;

    private String getAopBean(){
        return login.isLoginMethod("evet");
    }


}
