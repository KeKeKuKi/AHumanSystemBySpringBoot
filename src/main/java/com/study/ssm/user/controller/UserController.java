package com.study.ssm.user.controller;


import com.study.ssm.tools.Md5Function;
import com.study.ssm.user.domain.User;
import com.study.ssm.user.service.UserServiceImpl;
import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    Logger logger = LoggerFactory.getLogger(getClass());


    @RequestMapping("/login")
    public String login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        if(request.getSession().getAttribute("user")!=null){
           request.getSession().removeAttribute("user");
        }

        User user;
        String username = request.getParameter("name");


        if(username == null){
            request.getSession().setAttribute("logmess","请先登录！");
            logger.info(username+"登录失败---");
            return "index";
        }

        //使用MD5进行密码加密
        String password = Md5Function.getMd5String(request.getParameter("passWord"));
        user = userService.login(username);

        if (null != user) {
            if(password.equals(user.getPassWord())) {
                Cookie namecookie = new Cookie("userName", user.getName());
                if (request.getSession().getAttribute("logmess") != null) {
                    request.getSession().removeAttribute("logmess");
                }
                request.getSession().setAttribute("user", user);
                request.getSession().setMaxInactiveInterval(20 * 60);
                response.addCookie(namecookie);

                return "redirect:/templates/main.html";
            }else{

                request.getSession().setAttribute("logmess","密码错误！");
                logger.info(username+"登录失败---");
                return "index";
            }
        }else {

            request.getSession().setAttribute("logmess","没有此用户！");
            logger.info(username+"登录失败---");
            return "index";
        }

    }

    @RequestMapping("/register")
    public String register(User user, HttpServletRequest request, HttpServletResponse response) {
        user.setPassWord(Md5Function.getMd5String(user.getPassWord()));
        if(request.getParameter("emailkey").equals(request.getSession().getAttribute("emailkey"))){
            int n = userService.register(user);
            if (n == 1) {
                request.getSession().setAttribute("logmess","注册成功！");
            } else {
                request.getSession().setAttribute("logmess","注册失败！");
            }
        }
        return "index";
    }

    @RequestMapping("/checkusername")
    public void CheckUserName(HttpServletRequest request, HttpServletResponse response) throws IOException {
        User user = userService.login(request.getParameter("name"));
        if(user==null) response.getWriter().print("true");
        else response.getWriter().print("false");
    }

    @RequestMapping("/signout")
    public String signout(HttpServletRequest request){
        if(request.getSession().getAttribute("user")!=null){
            request.getSession().removeAttribute("user");
            if (request.getSession().getAttribute("logmess") != null) {
                request.getSession().removeAttribute("logmess");
            }
        }
        return "index";
    }


    @RequestMapping("/sendEmailKey")
    public void SendEmailKey(HttpServletRequest request,HttpServletResponse response) throws IOException {
        String email = request.getParameter("email");
        System.out.println(email+"*******");
        if("".equals(email)||email==null) {
            response.getWriter().print("false");
            return;
        }
        String emailkey = null;
        try {
            emailkey = userService.getEmailKey(email);
        } catch (Exception e) {
            response.getWriter().print("false");
        }
        if(emailkey!=null) {
            request.getSession().setAttribute("emailkey",emailkey);
            response.getWriter().print("true");
        }else {
            response.getWriter().print("false");
        }
    }
}
