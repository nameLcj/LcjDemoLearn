package com.lcj.mybatis.dao.impl;

import org.apache.ibatis.session.SqlSession;

public class StudentDAOImpl  {

    public SqlSession sqlSession;
    public StudentDAOImpl(SqlSession sqlSession){
        this.sqlSession=sqlSession;
    }

    public String findNameById(Long id){
        String s = sqlSession.selectOne("StudentMapper.findNameById",id);
        return s;
    }

    public String findStudentById(Long id) {
        String s = sqlSession.selectOne("StudentMapper.findNameById",id);

        return s;
    }


//    public Student findStudentById(Long id, String name) {
//        Student student = sqlSession.selectOne("StudentMapper.findStudentById", id);
//        return student;
//    }
}
