package org.youdian.springmvc.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.youdian.springmvc.model.User;
import org.youdian.springmvc.service.UserService;


public class UserTest {

    private UserService userService;

    @Before
    public void before() {
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:WEB-INF/mvc-dispatcher-servlet.xml"
                , "classpath:conf/spring-mybatis.xml"});
        userService = (UserService) context.getBean("userServiceImpl");
    }

    @Test
    public void addUser() {
        User user = new User("xiaoming", "23", "male");
        System.out.println(userService.insertUser(user));
    }
}