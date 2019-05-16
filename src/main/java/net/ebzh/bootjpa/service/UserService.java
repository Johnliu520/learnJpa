package net.ebzh.bootjpa.service;

import net.ebzh.bootjpa.model.User;

import java.util.List;

/**
 * @Author: John Ming
 * @Date: 2019/5/16 16:00
 * @Version 1.0
 * @describe:
 */
public interface UserService {

    User findUserOne(Integer id);
    List<User> findUserAll();

}
