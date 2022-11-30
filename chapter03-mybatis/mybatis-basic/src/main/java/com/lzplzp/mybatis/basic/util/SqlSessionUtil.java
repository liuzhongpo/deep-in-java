package com.lzplzp.mybatis.basic.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author lzplzp
 * @create 2022-11-30 15:36
 */
public class SqlSessionUtil {

    public static SqlSession getSqlSession(String configPath) {
        SqlSession sqlSession = null;

        try {
            InputStream inputStream = Resources.getResourceAsStream(configPath);
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
            sqlSession = sqlSessionFactory.openSession(true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return sqlSession;
    }

}
