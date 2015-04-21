package org.youdian.springmvc.dao;

import org.springframework.stereotype.Repository;
import org.youdian.springmvc.model.User;

/**
 * Created by Admin on 2015/4/21.
 */
@Repository
public interface UserDao {
    public int insertUser(User user);
}
