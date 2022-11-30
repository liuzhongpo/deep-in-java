package com.lzplzp.mybatis.basic.mapper;

import com.lzplzp.mybatis.basic.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author lzplzp
 * @create 2022-11-30 15:29
 */
public interface EmpMapper {

    void insert(Emp emp);

    int batchInsert(@Param("emps") List<Emp> emps);

    Emp getByEid(int eid);

    Emp getByEidAndName(int eid,String empName);

}
