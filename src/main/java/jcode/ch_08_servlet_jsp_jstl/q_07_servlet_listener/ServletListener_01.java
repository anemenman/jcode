package jcode.ch_08_servlet_jsp_jstl.q_07_servlet_listener;

import javax.servlet.*;

public class ServletListener_01 {

    ServletRequestListener servletRequestListener;

    ServletRequestEvent servletRequestEvent;

    ServletRequestAttributeListener servletRequestAttributeListener;

    ServletRequestAttributeEvent servletRequestAttributeEvent;

    ServletContextListener servletContextListener;

    ServletContextEvent servletContextEvent;
}

class MyContextListener implements ServletContextListener {

    @Override
    public void contextDestroyed(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
    }

    @Override
    public void contextInitialized(ServletContextEvent arg0) {
        System.out.println("Context Created");
    }

}
