package com.itheima.ssm.controller;

import com.itheima.ssm.bean.User;
import com.itheima.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(User user, HttpSession session){
        User loginUser = userService.findUser(user);
        if (loginUser != null) {
            session.setAttribute("user",loginUser);
            return "redirect:/admin/index.html";
        }else {
            return "redirect:/login.html";
        }
    }
    @RequestMapping("/save")
    public String register(User user){
        int row = userService.save(user);
        if (row>0){
            return "redirect:/login.html";
        }else {
            return "redirect:/register.html";
        }
    }
}
