package com.houtai.controller;

import com.houtai.pojo.Employee;
import com.houtai.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/login",produces = "text/html;utf-8")
    public String login(String empid, String password, HttpSession session, Model m)  {
        Employee employee = employeeService.login(empid, password);
        if (employee !=null){
            //登录成功
            session.setAttribute("employee",employee);
            //跳转页面
            return "redirect:/main";
        }else {
            //登录失败
            m.addAttribute("msg","账号或密码错误，请重新输入");
            return "login";
        }
    }
}
