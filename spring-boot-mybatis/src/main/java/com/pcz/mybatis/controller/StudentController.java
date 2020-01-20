package com.pcz.mybatis.controller;

import com.pcz.mybatis.model.Student;
import com.pcz.mybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author picongzhi
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public Student queryStudent(@RequestParam String no) {
        return studentService.queryStudent(no);
    }
}
