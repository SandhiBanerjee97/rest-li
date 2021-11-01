package com.demo;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AuthFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter Working");
    }
    /*We can use OAuth and other security related technologies here */

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        if (((HttpServletRequest)request).getSession().getAttribute("username")==null){
            ((HttpServletResponse)response).sendRedirect("/");        }
        else{

            chain.doFilter(request,response);
        }
    }
    @Override
    public void destroy() {
    }
}
