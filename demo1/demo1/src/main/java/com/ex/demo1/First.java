package com.ex.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class First {
    @GetMapping("/hello")

    public String sayHello(){
        return "HI FRIENDS 💗";
    }
    @GetMapping("/address")

    public String sayAddress(){
        return "Coimbatore 🏙️";
    }
    @GetMapping("/color")

    public String sayColor(){
        return "Maroon ♥️";
    }
}
