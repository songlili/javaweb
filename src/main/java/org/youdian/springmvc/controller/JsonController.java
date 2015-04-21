package org.youdian.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.youdian.springmvc.model.User;
import org.youdian.springmvc.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 2015/4/20.
 */

@Controller
@RequestMapping("/user")
public class JsonController {
    @Autowired
    private UserService userService;
    @ResponseBody
    @RequestMapping("/xiaoming")
    public User getUser() {
        User user = new User("xiamhua", "18", "male");
        return user;
    }

    @ResponseBody
    @RequestMapping("/list")
    public List<User> getUsers() {
        List<User> users = new ArrayList<User>();
        users.add(new User("ahua", "18", "男性"));
        users.add(new User("axiing", "21", "male"));
        return users;

    }

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String newUser() {
        return "newuser";
    }

    @ResponseBody
    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public User newUser(String name, String age, String gender) {
        User user = new User(name, age, gender);
        System.out.println(user);
        userService.insertUser(user);
        return user;
    }
}
