package com.neuedu.controller;

import com.neuedu.service.CartserviceJDK;
import com.neuedu.service.cart;
import com.neuedu.service.cartsProxy;
import com.neuedu.service.cartservice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cart {

    public static void main(String[] args) {
        //从容器获取
        //加载容器
           ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Spring-config.xml");
              //容器中获取bean
//            Object O=  applicationContext.getBean("cart");
//              if(O instanceof   cartservice){
//                  cartservice cartservice = (cartservice) O;
//                  System.out.println(cartservice.getName()+"ssss");
//                  System.out.println(cartservice.getLala());
//              }
//        Object O1=  applicationContext.getBean("cart");
//        System.out.println(O==O1);
//

      //  cartservice cartservice=(cartservice)applicationContext.getBean(cart.class);
      //cart ss=(cart) CartserviceJDK.newInstance(cartservice);
     //ss.ss();
          cart cartservice=applicationContext.getBean(cart.class);
         cartservice.ss(45,"sasasas");



        //静态代理
     //   cartsProxy cartsProxy= (cartsProxy) applicationContext.getBean("cartsProxy");
         //    cartsProxy.ss();


    }
}
