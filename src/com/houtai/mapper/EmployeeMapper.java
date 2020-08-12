package com.houtai.mapper;

import com.houtai.pojo.Employee;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeMapper {

    @Select("select * from employee where empid =#{param1} and password = #{param2}")
    public Employee login(String empid, String password);
}
