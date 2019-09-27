package com.tuling.timer;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by shuo.xu on 2017/11/10.
 */
public class MessegeTaskListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        WebApplicationContext con= WebApplicationContextUtils.getWebApplicationContext(sce.getServletContext());
        MessegeTimerTask messegeTimerTask=con.getBean(MessegeTimerTask.class);
        new MessegeTimerManager(messegeTimerTask);
    }
    public void contextDestroyed(ServletContextEvent sce) {
    }

}
