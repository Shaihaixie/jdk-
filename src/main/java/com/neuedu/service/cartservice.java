package com.neuedu.service;

import com.neuedu.DAO.CartDao;
import com.neuedu.DAO.impl.CartDaoimpl1;
import com.neuedu.eneytiy.cartt;
import com.neuedu.eneytiy.lala;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import java.security.PrivateKey;

//@Service
//@Scope("singleton")
@Service("cartservice")
public class cartservice implements cart {
    private String name;
    //     @Autowired
//     @Qualifier("lala")
//@Autowired bytype
//@Qualifier指定具体加载
//byname
    @Autowired
    @Qualifier("cartDaoimpl2")
    private  CartDao cartDao;
    @Resource(name = "sss")
    private lala lala;

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct //
    public void init() {
        System.out.println("我是init");
    }

    public String getName() {
        return name;
    }

    public void ss() {
        cartDao.ss();
    }

    //@Autowired
//@Qualifier("CartDaoimpl2")
    @Qualifier("CartDaoimpl1")
//@Resource(name = "CartDaoimpl2")//有问题
    private CartDao CartDao;


    public lala getLala() {
        return lala;
    }

    // @Required  在bean 的set上
    public void setLala(lala lala) {
        this.lala = lala;
    }

    public cartservice(String name) {
        this.name = name;

    }

    public cartservice() {
    }

    @PreDestroy
    public void destory() {
        System.out.println("我是destory");
    }

    @Override
    public cartt ss(int cartid, String name) {
        System.out.println("======正在執行");
        if (cartid==10){
            throw  new RuntimeException("自己的錯誤");
        }
        return  new cartt();
    }
}
