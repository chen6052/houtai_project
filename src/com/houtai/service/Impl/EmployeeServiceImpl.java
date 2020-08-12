package com.houtai.service.Impl;

import com.houtai.mapper.EmployeeMapper;
import com.houtai.pojo.Employee;
import com.houtai.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public Employee login(String empid, String password) {
        return employeeMapper.login(empid, password);
    }
}
