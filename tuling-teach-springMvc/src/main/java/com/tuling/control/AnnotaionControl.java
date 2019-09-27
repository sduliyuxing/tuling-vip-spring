package com.tuling.control;

import com.tuling.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Tommy on 2017/10/17.
 */
@Controller
public class AnnotaionControl {

    @Autowired
    private TestService testService;

    @RequestMapping("/getName.do")
    public ModelAndView getName(String name, HttpServletRequest request,HttpServletResponse response) throws IOException {
        System.out.println(testService.getClass());

        if(name.equals("1")){
            response.getWriter().append("hello easy mvc");
            response.getWriter().flush();
            return null;
        }
        ModelAndView mv=new ModelAndView("userView");
        mv.addObject("name","hello :"+name);
        return mv;
    }
}
