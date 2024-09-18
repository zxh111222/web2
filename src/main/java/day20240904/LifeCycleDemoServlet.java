package day20240904;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;

@WebServlet("/life-cycle")
public class LifeCycleDemoServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("LifeCycleDemoServlet.init");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.setContentType("text/html;charset=UTF-8");
        servletResponse.getWriter().println("servletRequest class: " + servletRequest.getClass());
        servletResponse.getWriter().println("servletResponse class: " + servletResponse.getClass());

        if (servletRequest instanceof HttpServletRequest) {
            servletResponse.getWriter().println("servletRequest 是 HttpServletRequest 的一个实例");
        } else {
            System.out.println("不是");
        }

        if (servletResponse instanceof HttpServletResponse) {
            servletResponse.getWriter().println("servletResponse 是 HttpServletResponse  的一个实例");
        } else {
            System.out.println("不是");
        }

        servletResponse.getWriter().println("LifeCycleDemoServlet.service");;
    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {
        System.out.println("LifeCycleDemoServlet.destroy");
    }
}
