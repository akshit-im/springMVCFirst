package com.kyle1697;

import com.kyle1697.Model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @Autowired
    AlienRepo repo;

    @GetMapping("/")
    public String home(){
        System.out.println("Home page Requested");
        return "index";
    }

//    @RequestMapping("add")
//    public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, Model m ){
//        // can have any method name
//
//        System.out.println("In add");
//       // ModelAndView mv = new ModelAndView("result");
//        int num3 = i+j;
//        m.addAttribute("num3", num3);
//        return "result";
//
//    }
//
    //@PostMapping(value = "addAlien")
    @RequestMapping(value = "addAlien", method = RequestMethod.POST)
    public String addAlien(@ModelAttribute Alien a){

        repo.save(a);
        return "result";
    }

    @GetMapping(value = "getAliens")
    public String getAliens(Model m){

        m.addAttribute("result",repo.findAll());
        return "showAliens";

    }

    @GetMapping(value = "getAlien")
    public String getAlien(@RequestParam int aid, Model m){


        m.addAttribute("result",repo.findById(aid));
        return "showAliens";

    }

    @GetMapping(value = "getAlienByName")
    public String getAlienByName(@RequestParam String aname, Model m){


        m.addAttribute("result",repo.find(aname));
        return "showAliens";

    }

    @DeleteMapping(value = "deleteAlien")
    public void deleteAlien(@RequestParam int aid){

        //m.addAttribute("result",repo.findById(aid));
        repo.deleteById(aid);
        //return "";

    }
}
