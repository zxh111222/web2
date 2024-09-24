package day20240918;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/ResponseServlet5")
public class ResponseServlet5 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = this.getServletContext().getRealPath("/day20240918/test.png");
        FileInputStream fis = new FileInputStream(path);

        ServletOutputStream sos = response.getOutputStream();

        response.setHeader("Content-Disposition", "attachment");

        IOUtils.copy(fis, sos);

        fis.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
