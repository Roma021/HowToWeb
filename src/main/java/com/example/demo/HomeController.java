package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homepage() {
        return "main";
    }
    @RequestMapping("/2")
    public String page2(){
        return "page2";
    }
    @RequestMapping("/3")
    public String page3() {
        return "page3";
    }
}
