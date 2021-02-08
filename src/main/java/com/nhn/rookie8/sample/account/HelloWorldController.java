package com.nhn.rookie8.sample.account;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class HelloWorldController {
    @GetMapping("/")
    public String welcome(Model model) {
        model.addAttribute("time", new Date());
        model.addAttribute("message", "hello world sample");
        return "welcome";
    }

}
