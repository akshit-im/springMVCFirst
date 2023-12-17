package com.kyle1697;

import com.kyle1697.Model.Alien;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

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

    //@PostMapping(value = "addAlien")
    @RequestMapping(value = "addAlien", method = RequestMethod.POST)
    public String addAlien(@ModelAttribute Alien a){

        return "result";
    }

    @GetMapping(value = "getAliens")
    public String getAliens(Model m){
        List<Alien> al = Arrays.asList(new Alien(313,"Akshit"),new Alien(414,"Saini"));
        m.addAttribute("result",al);
        return "showAliens";
    }
}
