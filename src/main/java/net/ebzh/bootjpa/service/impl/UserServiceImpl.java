package net.ebzh.bootjpa.service.impl;

import net.ebzh.bootjpa.model.User;
import net.ebzh.bootjpa.repository.UserRepository;
import net.ebzh.bootjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: John Ming
 * @Date: 2019/5/16 16:01
 * @Version 1.0
 * @describe:
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findUserOne(Integer id) {
        return userRepository.getOne(id);
    }

    @Override
    public List<User> findUserAll() {
        return userRepository.findAll();
    }
}
