package day20240923;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/HwLanguageServlet")
public class HwLanguageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String lang = request.getParameter("lang");
        if (lang != null) {

            Cookie langCookie = new Cookie("lang", lang);
            langCookie.setMaxAge(60 * 60 * 24 * 30);
            response.addCookie(langCookie);
        } else {

            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    if (cookie.getName().equals("lang")) {
                        lang = cookie.getValue();
                    }
                }
            }
        }


        if (lang == null) {
            lang = request.getLocale().getLanguage().equals("en") ? "en" : "zh";
        }


        request.setAttribute("lang", lang);
        RequestDispatcher dispatcher = request.getRequestDispatcher("day20240923/lang.jsp");
        dispatcher.forward(request, response);
    }
}