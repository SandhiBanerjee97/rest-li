package com.demo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    protected  void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String userName = request.getParameter("name");
        String userPass = request.getParameter("password");
        PrintWriter out=response.getWriter();
        response.setContentType("text/html");
        if (userName.equals("sandhi") && userPass.equals("admin")){
            try {
                HttpSession session = request.getSession();
                session.setAttribute("username",userName);
                response.sendRedirect("api/employees");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            out.print("Sorry username or password error");
            RequestDispatcher rd=request.getRequestDispatcher("index.html");
            rd.include(request,response);
        }
    }
}
