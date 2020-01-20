package com.pcz.mybatis.service;

import com.pcz.mybatis.model.Student;

/**
 * @author picongzhi
 */
public interface StudentService {
    int add(Student student);

    int update(Student student);

    int deleteByNo(String no);

    Student queryStudent(String no);
}
