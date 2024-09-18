package day20240904;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        System.out.println("MyHttpServlet.doPost:username=" + username + ",password=" + password);

        boolean isValUser = valUser(username,password);
        if (isValUser) {
            writer.println("<h1>登录成功！</h1>");
        } else {
            writer.println("<h1>登录失败！</h1>");
            writer.println("<a href=\"day20240904/login.html\">返回登录页面</a>");
        }

    }

    private boolean valUser(String username, String password) {
        boolean isVal = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("JDBC驱动加载成功！");
            Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
            System.out.println("数据库连接成功！");

            String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);
            System.out.println("正在验证用户名：" + username);

            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                isVal = true;
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isVal;
    }
}
