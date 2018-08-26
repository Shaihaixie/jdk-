package com.neuedu.service;

import com.neuedu.aspect.LogAspect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CartserviceJDK implements InvocationHandler {

    public Object target;//原对象

    private LogAspect LogAspect = new LogAspect();

    public CartserviceJDK(Object target) {
        super();
        this.target = target;
    }

    /*
     * 生成代理對象*/
    public static Object newInstance(Object Object) {
        Object o = Proxy.newProxyInstance(Object.getClass().getClassLoader(), Object.getClass().getInterfaces(), new CartserviceJDK(Object));
        return o;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        LogAspect.start();
        try {
            //反射机制调用target对象的方法
            method.invoke(target, args);
        } catch (Exception e) {
            LogAspect.throwing();
        }
        LogAspect.finish();
        return null;
    }
}
