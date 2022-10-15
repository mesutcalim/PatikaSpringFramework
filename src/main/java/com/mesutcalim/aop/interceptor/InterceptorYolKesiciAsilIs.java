package com.mesutcalim.aop.interceptor;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Interceptor
@InterceptorYolKesici
public class InterceptorYolKesiciAsilIs {
    @AroundInvoke public Object loglama(InvocationContext context){
        System.out.println("İlk hali : " + context.getMethod().getName());
        //kullanıcı giriş yapmış mı?
        boolean isLogin=false; //true: önce login olmalı anlamında  // yol kesici değişkenimiz
        //jdbc:session?
        Object isContinue =null; //yol kesilmezse devam edeceğim
        if(isLogin) {
            //Önce sisteme giriş yapsın
            System.out.println("Önce sisteme giriş yapsın!!");
            return null;
        }else
        {
            try{
                isContinue=context.proceed(); //devam etmesini sağlayacak
                System.out.println("Sonraki Hali "+ isContinue);
            }catch(Exception e) {
                e.printStackTrace();
        }
            return isContinue;
        }
    }
}


