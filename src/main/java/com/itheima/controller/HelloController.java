package com.itheima.controller;

import com.itheima.domain.Result;
import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.UUID;

@Controller
@RequestMapping("/hello")
public class HelloController {
@RequestMapping("/demo2")
public ModelAndView demo2(){
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("error");
    modelAndView.addObject("error","error");

    return modelAndView;
}
//    public String demo2(@RequestBody String body){
//    String s = URLDecoder.decode(body);
//    System.out.println(s);
//    System.out.println(body);
//    return "success";
//}
@RequestMapping("/demo3")
    public String demo3(@RequestBody User user){
    int i = 1/0;
    System.out.println(user);
    return "success";
}
@RequestMapping("/demo4")
    public void demo4(MultipartFile uploadFile) throws IOException {
    File file = new File("G:\\txtt");
    String newFileName = UUID.randomUUID()+uploadFile.getOriginalFilename();
    uploadFile.transferTo(new File(file,newFileName));
}
@RequestMapping("/demo18")
    public String demo18(){
    System.out.println("==到达了controller===");
    return "success";
}
}
