package com.lzplzp.mybatis.basic.test;

import com.lzplzp.mybatis.basic.mapper.DeptMapper;
import com.lzplzp.mybatis.basic.pojo.Dept;
import com.lzplzp.mybatis.basic.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author lzplzp
 * @create 2022-11-30 15:36
 */
public class DeptMapperTest {

    @Test
    public void testInsertOne() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession("mybatis-config.xml");
        DeptMapper deptMapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = new Dept();
        dept.setDeptName("运营部");
        int one = deptMapper.insertOne(dept);
        System.out.println(one);
    }
}
