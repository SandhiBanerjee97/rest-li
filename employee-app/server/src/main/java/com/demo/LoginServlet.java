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

        /*We can use DB here ,proper session management and password encoding
        * and all the necessary operations and follow all the best practices for
        * servlets */

        if (userName.equals("mukeshSir") && userPass.equals("admin")){
            try {
                HttpSession session = request.getSession();
                session.setAttribute("username",userName);
                response.sendRedirect("api/employees");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            out.print("<center><b>Wrong Credentials Try Again ...!</b></center>");
            RequestDispatcher rd=request.getRequestDispatcher("index.html");
            rd.include(request,response);
        }
    }
}
