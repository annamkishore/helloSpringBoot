package kish.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @RequestMapping("/hello")
    public String home() {
        return "Hello World 2";
    }

    @GetMapping("/wish")
    public String service1() {
        return "Good Morning";
    }
}
