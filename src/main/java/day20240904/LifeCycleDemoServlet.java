package day20240904;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.catalina.connector.RequestFacade;

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
        System.out.println("servletRequest class: " + servletRequest.getClass());
        System.out.println("servletResponse class: " + servletResponse.getClass());

        if (servletRequest instanceof HttpServletRequest) {
            System.out.println("servletRequest 是 HttpServletRequest 的一个实例");
        } else {
            System.out.println("不是");
        }

        if (servletResponse instanceof HttpServletResponse) {
            System.out.println("servletResponse 是 HttpServletResponse  的一个实例");
        } else {
            System.out.println("不是");
        }

        servletResponse.getWriter().write("LifeCycleDemoServlet.service");;
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
