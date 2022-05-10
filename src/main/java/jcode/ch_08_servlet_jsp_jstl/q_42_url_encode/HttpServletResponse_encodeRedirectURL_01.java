package jcode.ch_08_servlet_jsp_jstl.q_42_url_encode;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpServletResponse_encodeRedirectURL_01 {
}

class Login extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        response.encodeRedirectURL("...");//+jsession id в конец строки
    }
}
