package com.example.Helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/")
   public String home(){

        System.out.println("in sout");
        return "home";
    }
}
