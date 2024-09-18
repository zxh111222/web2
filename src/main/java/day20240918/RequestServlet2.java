package day20240918;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/RequestServlet2")
public class RequestServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();
        String req_ = request.toString();
        String resp_ = response.toString();
        writer.write("<h1>request 是谁实现的：" + req_ + "</h1>" + System.lineSeparator());
        writer.write("<h1>response 是谁实现的：" + resp_ + "</h1>" + System.lineSeparator());
    }
}