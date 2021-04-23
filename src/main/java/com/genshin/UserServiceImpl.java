package com.genshin;

import com.genshin.ioc.IUserDao;
import com.genshin.ioc.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {
//    @Resource(name ="userDao")
    @Autowired
    private IUserDao userDao;

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void say() {
        this.userDao.say();
        System.out.println("userService say hello World!");
    }
}
