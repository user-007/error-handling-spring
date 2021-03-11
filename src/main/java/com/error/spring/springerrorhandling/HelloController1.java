package com.error.spring.springerrorhandling;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HelloController1 {
    @GetMapping("/crash-me1")
    public ModelAndView crashMe1(){
        throw new RuntimeException("Crashed 2 ;)");
    }
}
