package com.servlet;

import com.Service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Arrays;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //登陆验证
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String name = request.getParameter("name");
        String pass = request.getParameter("pass");
        PrintWriter out = response.getWriter();
        boolean bool = new UserService().login(name,pass);
        //System.out.print(name);
        if(!bool){
            request.setAttribute("error","验证失败");
            request.getRequestDispatcher("login.jsp").forward(request,response);
            /*out.print(request.getParameter("name"));
            out.print(request.getParameter("pass"));
            out.print(request.getAttribute("error"));*/
        }
        HttpSession session = request.getSession(true);
        session.setAttribute("name",name);
        response.sendRedirect("/article.jsp");
        /*
        Cookie[] putCookie = request.getCookies();
        Cookie cookie = new Cookie("user", name);
        response.addCookie(cookie);
        PrintWriter write = response.getWriter();
        write.print(name);
        Cookie c = null;

        String usertype = null;
        if (putCookie != null) {
            for (int i = 0; i < putCookie.length; i++) {
                c = putCookie[i];
                if (c.getName().equals("user")) {
                    write.print("<br/>");
                    write.print( c.getValue());
                    //usertype = c.getValue();
                }
                //write.print("name:"+putCookie[0].getName());
                //write.print("value:"+putCookie[0].getValue());
            }
        }
        write.print("-----");
        //session  没有session创建一个
        HttpSession session = request.getSession(true);
        session.setAttribute("name",name);
        write.print(session.getAttribute("name"));*/
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          //登陆页面
        response.sendRedirect("login.jsp");
    }
}
