package com.lcj.mybatis.dao;

import com.lcj.mybatis.entily.Student;
import org.apache.ibatis.annotations.Param;

import java.security.acl.LastOwnerException;
import java.util.List;

public interface StudentDAO {
    public String findNameById(@Param("id") Long id);
//    public Student findStudentById(@Param("id") Long id);
    public String findNameByIdAndAge(@Param("id") Long id,@Param("age") int age);

    public Student findStudentById(@Param("id") Long id);
    public Student findStudentById1(@Param("id") Long id);
    public List<Student> findAllStudent();

    public int insertStudent(@Param("id") Long id,@Param("name") String name,@Param("sex") String sex,@Param("age") Long age,
                             @Param("address") String address);

    public int insertStudent1(@Param("id")Long id, @Param("name") String name, @Param("age") Long age);

    public int updateStudentById(@Param("id") Long id,@Param("name") String name);

    public int deleteStudentById(@Param("id") Long id);

}
