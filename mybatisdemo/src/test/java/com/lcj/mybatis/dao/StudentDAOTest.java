package com.lcj.mybatis.dao;

import com.lcj.mybatis.entily.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.annotation.Resource;
import java.io.InputStream;
import java.sql.SQLOutput;
import java.util.List;

public class StudentDAOTest {
    public StudentDAO studentDAO;
    @Before
    public void setUp() throws Exception {
        // 指定配置文件
        String resource = "mybatis-config.xml";
        // 读取配置文件
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // 构建sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        // 1. 映射文件的命名空间（namespace）必须是mapper接口的全路径
        // 2. 映射文件的statement的id必须和mapper接口的方法名保持一致
        // 3. Statement的resultType必须和mapper接口方法的返回类型一致
        // 4. statement的parameterType必须和mapper接口方法的参数类型一致（不一定）
        studentDAO = sqlSession.getMapper(StudentDAO.class);

    }

    @Test
    public void findNameById() throws Exception {
        String name = studentDAO.findNameById(1L);
        System.out.println(name);
    }

    @Test
    public void findNameByIdAndAge (){
        String name2 = studentDAO.findNameByIdAndAge(2l,19);
        System.out.println(name2);
    }

    @Test
    public void findStudentById() throws Exception{
        Student student = studentDAO.findStudentById(2l);
        System.out.println(student.toString());
    }

    @Test
    public void findStudentById1 (){
        try {
            Student student2 = studentDAO.findStudentById1(9l);
            System.out.println(student2.toString());
        }finally {
            System.out.println("没有学生、、、、");
        }

    }

    @Test
    public void findAllStudent(){
        List<Student> list = studentDAO.findAllStudent();
        System.out.println(list.size());
    }

    @Test
    public void insert(){
        studentDAO.insertStudent(7L,"lcj07","男",19L,"天津");
    }

    @Test
    public void insert1(){
        int i = studentDAO.insertStudent1(8l,"lcj08",19l);
        System.out.println(i);
    }

    @Test
    public void update(){
        int j = studentDAO.updateStudentById(7l,"lcjlcj");
        System.out.println("updateStudentById"+j);
    }

    @Test
    public void delete(){
        int z = studentDAO.deleteStudentById(6l);
        System.out.println( "deleteStudentById:" + z);
    }

    @After
    public void tearDown() throws Exception {
    }


}