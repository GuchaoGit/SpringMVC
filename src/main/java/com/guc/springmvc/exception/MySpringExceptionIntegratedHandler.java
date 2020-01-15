package com.guc.springmvc.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author guc
 * @Date 2020/1/15 14:28
 * @Description 自己手动编写Java代码来实现定制异常信息处理
 */
public class MySpringExceptionIntegratedHandler implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse httpServletResponse, Object o, Exception ex) {
        //这里可以根据异常的类型来决定什么样的对策
        System.out.println("异常已经被处理了");
        System.out.println("异常的类型是:" + ex.getClass().getName());
        request.setAttribute("ex",ex);
        return new ModelAndView("runtimeExceptionPage");
    }
}
