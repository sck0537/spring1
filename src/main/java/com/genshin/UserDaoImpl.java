package com.genshin;

import com.genshin.ioc.IUserDao;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements IUserDao {
    @Override
    public void say() {
        System.out.println("userDaoImpl say hello World!");
    }
}
