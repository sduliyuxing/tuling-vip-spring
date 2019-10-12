package com.tuling.timer;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import java.util.Date;
import java.util.Timer;

/**
 * Created by shuo.xu on 2017/11/10.
 */
public class MessegeTimerManager {
    public MessegeTimerManager( MessegeTimerTask task ) {
        Timer timer = new Timer();
//        MessegeTimerTask task = new MessegeTimerTask();
        timer.schedule(task,20000L,50000);
    }

}
