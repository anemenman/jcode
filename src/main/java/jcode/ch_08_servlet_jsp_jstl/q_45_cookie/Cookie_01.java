package jcode.ch_08_servlet_jsp_jstl.q_45_cookie;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cookie_01 {
}

class Login extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) {

        request.getCookies();// get request cookies

        Cookie cookie = new Cookie("Id", "123");
        response.addCookie(cookie);// set cookie
    }
}
