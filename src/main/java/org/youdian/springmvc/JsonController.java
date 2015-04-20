package org.youdian.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 2015/4/20.
 */

@Controller
@RequestMapping("/user")
public class JsonController {

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
        users.add(new User("ahua", "18","female"));
        users.add(new User("axiing","21","male"));
        return users;

    }
}
