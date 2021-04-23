package com.genshin;

import com.genshin.ioc.IUserDao;
import com.genshin.ioc.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
//        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");




        IUserService iUserService=(IUserService)applicationContext.getBean("userService");
        iUserService.say();


    }
}
