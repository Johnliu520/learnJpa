package net.ebzh.bootjpa.service;

import net.ebzh.bootjpa.model.Student;

import java.util.List;
import java.util.Map;

/**
 * @Author: John Ming
 * @Date: 2019/5/17 15:40
 * @Version 1.0
 * @describe:
 */
public interface StudentClassService {

    /**
     * 返回List<Object[]>
     * @return  List<Object[]>
     *
     */
    List<Object[]> listStudent();
    /**
     * 返回List<Student>
     * @return  List<Student>
     *
     */
    List<Student> listStudentModel();
    /**
     * List<Map<Object, Object>>
     * @return  List<Map<Object,Object>>
     *
     */
    List<Map<Object, Object>> listStudentMap();
}
