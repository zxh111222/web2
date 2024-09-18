package day20240908;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/request_demo1_servlet")
public class RequestDemo1Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String lang = request.getParameter("lang");
        String page = request.getParameter("page");
        response.getWriter().write("request.getMethod():   " + request.getMethod() + " - 获取 HTTP 请求的方法  <br>");
        response.getWriter().write("request.getContextPath():   " + request.getContextPath() + " - 获取 Servlet 上下文的根路径  <br>");
        response.getWriter().write("request.getRequestURL():   " + request.getRequestURL() + " - 获取请求的完整 URL  <br>");
        response.getWriter().write("request.getRequestURI():   " + request.getRequestURI() + " - 获取请求的 URI 部分，不包括协议、服务器名和端口号,它只是请求路径的部分  <br>");
        response.getWriter().write("request.getQueryString():   " + request.getQueryString() + " - 获取请求的查询字符串，即 ? 之后的部分  <br>");
    }
}
