package com.servlet;

import com.Bean.Article;
import com.Dao.ArticleDaoImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ArticleServlet")
public class ArticleServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Article> list = (ArrayList<Article>) new ArticleDaoImp().getAll();
        request.setAttribute("message",list);
        request.getRequestDispatcher("login.jsp").forward(request,response);
    }
}
