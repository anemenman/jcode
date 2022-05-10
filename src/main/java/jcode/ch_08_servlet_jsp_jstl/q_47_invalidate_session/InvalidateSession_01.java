package jcode.ch_08_servlet_jsp_jstl.q_47_invalidate_session;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InvalidateSession_01 {
}

class Logout extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) {

        request.getSession().invalidate();
    }
}
