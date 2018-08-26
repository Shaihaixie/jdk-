package com.neuedu;

import com.neuedu.eneytiy.lala;
import com.neuedu.service.cartsProxy;
import com.neuedu.service.cartservice;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

//相当于BEANS
@Configuration
//java容器注解
public class APPconfig {
//    @Bean(name = "cart",initMethod = "init" )
//    @Scope("singleton")
//    public cartservice cartservice(){
//        return  new cartservice();
//    }
@Bean(name = "sss")
 public lala lala(){
        return  new lala();
}
// @Bean(name="cartsProxy")
//    public cartsProxy cartsProxy(){
//        return  new cartsProxy();
// }

}
