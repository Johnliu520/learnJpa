package net.ebzh.bootjpa.service.impl;

import net.ebzh.bootjpa.model.Student;
import net.ebzh.bootjpa.service.StudentClassService;
import net.ebzh.bootjpa.utils.DynamicQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: John Ming
 * @Date: 2019/5/17 15:40
 * @Version 1.0
 * @describe:
 */

@Service
public class StudentServiceImpl implements StudentClassService {

    @Autowired
    private DynamicQuery dynamicQuery;

    @Override
    public List<Object[]> listStudent() {
        String nativeSql = "SELECT s.id AS studentId,s.sname,s.age,g.id AS classId,g.gname AS className  FROM student s,grade g";
        List<Object[]> list = dynamicQuery.nativeQueryList(nativeSql, new Object[]{});
        return list;
    }

    @Override
    public List<Student> listStudentModel() {
        String nativeSql = "SELECT s.id AS studentId,s.sname,s.age,g.id AS classId,g.gname AS className  FROM student s,grade g";
        List<Student> list = dynamicQuery.nativeQueryListModel(Student.class, nativeSql, new Object[]{});
        return list;
    }

    @Override
    public List<Map<Object, Object>> listStudentMap() {
        String nativeSql = "SELECT s.id AS studentId,s.sname,s.age,g.id AS classId,g.gname AS className  FROM student s,grade g";
        List<Map<Object,Object>> list = dynamicQuery.nativeQueryListMap(nativeSql, new Object[]{});
        return list;
    }
}
