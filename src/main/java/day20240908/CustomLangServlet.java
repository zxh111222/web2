package day20240908;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.lang.model.element.NestingKind;
import java.io.IOException;

@WebServlet("/custom_language")
public class CustomLangServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String lang = request.getParameter("lan");
        String info = "Hello World!";
        if ("zh-CN".equals(lang)) {
            info = "你好！";
        }else if ("zh-hk".equals(lang)) {
            info = "鄭";
        }

        response.getWriter().write(info);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
