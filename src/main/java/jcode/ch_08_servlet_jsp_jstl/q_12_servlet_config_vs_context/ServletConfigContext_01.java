package jcode.ch_08_servlet_jsp_jstl.q_12_servlet_config_vs_context;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletConfigContext_01 {
    public static void main(String[] args) {

    }
}

class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.print("<br>welcome to servlet<br>");

        getServletConfig().getInitParameter("myParam");
//        getServletConfig().setInitParameter("..."); // Нельзя!!!

        getServletContext().getInitParameter("Country");
        getServletContext().setInitParameter("City", "Kyiv");// Можно!!!

    }

}
