package com.guc.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author guc
 * @Date 2020/1/14 13:48
 * @Description
 *  * Controller 是一个基于注解的控制器
 *  * 可以同时处理多个请求动作
 */
@Controller
public class HelloController {
    /**
     * RequestMapping 用来映射一个请求和请求的方法
     * value="/hello" 表示请求由 hello 方法进行处理
     */
    @RequestMapping(value="/hello")
    public String hello() {
        // 返回一个字符串 " success" 作为视图名称
        return "hello";
    }

    //重定向
    @RequestMapping(value = "/redirect")
    public String redirect(){
        return "redirect:finalPage";
    }

    @RequestMapping(value = "/finalPage")
    public String finalPage(){
        return "final";
    }
}
