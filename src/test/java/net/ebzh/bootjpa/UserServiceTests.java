package net.ebzh.bootjpa;

import net.ebzh.bootjpa.model.User;
import net.ebzh.bootjpa.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @Author: John Ming
 * @Date: 2019/5/16 16:07
 * @Version 1.0
 * @describe:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class UserServiceTests {

    public static Log log = LogFactory.getLog(UserServiceTests.class);


    @Autowired
    private UserService userService;

    @Test
    public void findOne() throws Exception {
        User user = userService.findUserOne(1);
        log.info(user);
    }

    @Test
    public void findAll() throws Exception {
        List<User> user = userService.findUserAll();
        log.info(user);
    }

}
