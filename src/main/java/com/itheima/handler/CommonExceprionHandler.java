package com.itheima.handler;

import org.springframework.stereotype.Component;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Component
public class CommonExceprionHandler implements HandlerExceptionResolver {
@Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        System.out.println("aaa");
        modelAndView.setViewName("error");
    System.out.println(modelAndView.getViewName());
        modelAndView.addObject("error" ,"error");
        return modelAndView;
    }
}
