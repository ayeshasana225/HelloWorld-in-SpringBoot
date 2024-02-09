package com.example.springboot.controller;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/first")

public class HelloController {
    @GetMapping("hello")

    public String hello(Model modal){
        modal.addAttribute("mymsg","Hello World!");
        return "hello";
    }

    @GetMapping("bye")
    public String bye(){
        return "bye"; }
}
