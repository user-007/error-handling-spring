package com.error.spring.springerrorhandling;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @GetMapping("/crash-me")
    public ModelAndView crashMe(){
        throw new RuntimeException("Crashed");
    }
// @ExceptionHandler
//    public ModelAndView handleHelloException({Excep}){
//        ModelAndView modelAndView = new ModelAndView("errorHandler");
//        modelAndView.addObject("message",exce.getMessage());
//
//    }
    @GetMapping("/crash-me-bad")
    public ModelAndView crashBad(){
        throw new RuntimeException("crashed bad");
    }
}
