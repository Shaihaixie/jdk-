package com.neuedu.aspect;
/*
* 日志*/
public class LogAspect {
    public  void start(int cartid, String name){
        System.out.println("開始11111111111111111"+cartid);
    }
    public  void throwing(int cartid, String name){
        System.out.println("異常2222222222222222"+cartid);
    }
    public  void finish(int cartid, String name){
        System.out.println("结束3333333333333"+cartid);
    }
}
