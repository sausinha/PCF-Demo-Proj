package com.example;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PCFController {

    @RequestMapping("/welcome")
    public ModelAndView index() {
        return new ModelAndView("Welcome.html");
    }

}
