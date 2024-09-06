package day20240904;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class MyHttpServlet extends HttpServlet {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/login_test";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "123456";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println("MyHttpServlet.doGet:username=" + username + ",password=" + password);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        System.out.println("MyHttpServlet.doPost:username=" + username + ",password=" + password);

        boolean isValUser = valUser(username,password);

        resp.setContentType("text/html;charset=UTF-8");

        PrintWriter writer = resp.getWriter();
        if (isValUser) {
            登录成功
        } else {
            登录失败
        }

    }

    private boolean valUser(String username, String password) {
        boolean isVal = false;

        return isVal;
    }
}
