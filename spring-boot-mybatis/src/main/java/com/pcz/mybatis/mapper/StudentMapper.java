package com.pcz.mybatis.mapper;

import com.pcz.mybatis.model.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

/**
 * @author picongzhi
 */
@Component
@Mapper
public interface StudentMapper {
    @Insert("INSERT INTO `student`(`no`, `name`, `sex`) VALUES (#{no}, #{name}, #{sex})")
    int add(Student student);

    @Update("UPDATE `student` SET `name` = #{name}, `sex` = #{sex} WHERE `no` = #{no}")
    int update(Student student);

    @Delete("DELETE FROM `student` WHERE `no` = #{no}")
    int delete(String no);

    @Select("SELECT * FROM `student` WHERE `no` = #{no}")
    @Results(id = "student", value = {
            @Result(property = "no", column = "no", javaType = String.class),
            @Result(property = "name", column = "name", javaType = String.class),
            @Result(property = "sex", column = "sex", javaType = String.class)
    })
    Student queryStudentByNo(String no);
}
