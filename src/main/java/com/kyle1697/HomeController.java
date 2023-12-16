package com.kyle1697;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        System.out.println("Home page Requested");
        return "index.html";
    }

    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int i, @RequestParam("num2") int j, HttpSession session ){
        // can have any method name

        ModelAndView mv = new ModelAndView();
        mv.setViewName("result.html");
        int num3 = i+j;

        session.setAttribute("num3", num3);
        return mv;

    }
}
