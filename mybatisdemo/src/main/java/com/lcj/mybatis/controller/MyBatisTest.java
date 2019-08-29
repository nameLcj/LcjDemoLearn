package com.lcj.mybatis.controller;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.rmi.server.ExportException;

public class MyBatisTest {
    /**
     * Mybats使用步骤
     * 1、pom.xml: mybatis、mysql依赖
     * 2、mybatis-config.xml：配置数据源、mapper映射文件信息
     * 3、mapper.xml：映射文件
     * 4、实体类
     * 5、执行类
     * @param args
     * @throws Exception
     */

    public static void main(String[] args) throws Exception {
        //获取全局配置文件
        String source = "mybatis-config.xml";
        //读取配置文件
        InputStream inputStream = Resources.getResourceAsStream(source);
        //构建sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        try {
            //操作CRUD,第一个参数：指定statment,规则：命名空间+"."+statementId
            //第二个参数：指定传入sql的参数，这里是用户id
            String s = sqlSession.selectOne("StudentMapper.findNameById");
            System.out.println(s);

        }finally {
            sqlSession.close();
        }
    }

}
