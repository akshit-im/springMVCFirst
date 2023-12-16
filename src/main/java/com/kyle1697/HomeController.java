package com.kyle1697;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        System.out.println("Home page Requested");
        return "index";
    }

    @RequestMapping("add")
    public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, Model m ){
        // can have any method name

        System.out.println("In add");
       // ModelAndView mv = new ModelAndView("result");
        int num3 = i+j;
        m.addAttribute("num3", num3);
        return "result";

    }
}
