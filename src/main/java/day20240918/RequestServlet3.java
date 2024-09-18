package day20240918;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/RequestServlet3")
public class RequestServlet3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().write("request.getMethod():   " + request.getMethod() + System.lineSeparator());
        response.getWriter().write("request.getContextPath():   " + request.getContextPath() + System.lineSeparator());
        response.getWriter().write("request.getRequestURL():   " + request.getRequestURL() + System.lineSeparator());
        response.getWriter().write("request.getRequestURI():   " + request.getRequestURI() + System.lineSeparator());
        response.getWriter().write("request.getQueryString():   " + request.getQueryString() + System.lineSeparator());
        response.getWriter().write("request.getHeader(\"user-agent\")   " + request.getHeader("user-agent") + System.lineSeparator());

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
