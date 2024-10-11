package day20240923;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/product-tours-add-cookie")
public class DriverjsDemoAddCookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("friend", "1");
        cookie.setMaxAge(60 * 5);
        resp.addCookie(cookie);
        resp.sendRedirect( req.getContextPath() + "/product-tours");
    }
}