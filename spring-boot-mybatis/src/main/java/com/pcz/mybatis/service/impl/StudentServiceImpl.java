package com.pcz.mybatis.service.impl;

import com.pcz.mybatis.mapper.StudentMapper;
import com.pcz.mybatis.model.Student;
import com.pcz.mybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author picongzhi
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int add(Student student) {
        return studentMapper.add(student);
    }

    @Override
    public int update(Student student) {
        return studentMapper.update(student);
    }

    @Override
    public int deleteByNo(String no) {
        return studentMapper.delete(no);
    }

    @Override
    public Student queryStudent(String no) {
        return studentMapper.queryStudentByNo(no);
    }
}
