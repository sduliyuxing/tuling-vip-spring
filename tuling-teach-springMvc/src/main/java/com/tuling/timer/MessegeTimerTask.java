package com.tuling.timer;

import com.tuling.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.TimerTask;

/**
 * Created by shuo.xu on 2017/11/10.
 */
@Component
public class MessegeTimerTask extends TimerTask {

    @Autowired
    private TestService testService;

    public MessegeTimerTask() {

    }
    static int i=0;
    @Override
    public void run() {
        System.out.println("隔5秒打印一次,目前第"+i+++"次！");
        System.out.println(testService);
    }

}
