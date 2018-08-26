package com.neuedu.DAO.impl;

import com.neuedu.DAO.CartDao;
import org.springframework.stereotype.Repository;

@Repository
public class CartDaoimpl2 implements CartDao {
    @Override
    public void ss() {
        System.out.println("我是cartservice");

    }
}
