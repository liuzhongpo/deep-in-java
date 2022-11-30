package com.lzplzp.mybatis.basic.test;

import com.lzplzp.mybatis.basic.mapper.DeptMapper;
import com.lzplzp.mybatis.basic.mapper.EmpMapper;
import com.lzplzp.mybatis.basic.pojo.Dept;
import com.lzplzp.mybatis.basic.pojo.Emp;
import com.lzplzp.mybatis.basic.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lzplzp
 * @create 2022-11-30 15:44
 */
public class EmpMapperTest {

    @Test
    public void testInsert() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession("mybatis-config.xml");
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = new Emp();
        emp.setEmpName("张三");
        emp.setAge(18);
        empMapper.insert(emp);
        System.out.println(emp);
    }

    @Test
    public void testBatchInsert() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession("mybatis-config.xml");
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = new Emp("李四",22,2);
        Emp emp2 = new Emp("王五",32,2);
        Emp emp3 = new Emp("陆柳=六",29,2);
        List<Emp> list = Arrays.asList(emp, emp2, emp3);
        System.out.println(empMapper.batchInsert(list));
    }

    @Test
    public void testGetByEid() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession("mybatis-config.xml");
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = empMapper.getByEid(2);
        System.out.println(emp);
    }
}
