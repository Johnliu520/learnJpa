package net.ebzh.bootjpa;

import net.ebzh.bootjpa.service.impl.StudentServiceImpl;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

/**
 * @Author: John Ming
 * @Date: 2019/5/17 15:45
 * @Version 1.0
 * @describe:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class StudentClassTest {


    @Autowired
    private StudentServiceImpl studentService;

    @Test
    public void listStudent() throws Exception {
        System.out.println(studentService.listStudent());
    }

    @Test
    public void listStudentModel() throws Exception {
        System.out.println(studentService.listStudentModel());
    }

    @Test
    public void listStudentMap() throws Exception {
        System.out.println(studentService.listStudentMap());
    }

}
