package com.example.demo2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class First {
    @GetMapping("add/{a}/{b}")
    public String sayAdd(@PathVariable int  a ,@PathVariable int b)
        { return "Addition :" + (a+b) ;}
    @GetMapping("/sub/{a}/{b}")
    public int sayDiff(@PathVariable int a,@PathVariable int b){
        return a - b;
    }
    @GetMapping("/mul/{e}/{f}")
    public int sayMul(@PathVariable int e,@PathVariable int f){
        return  e * f;
    }
    @GetMapping("/div/{c}/{d}")
    public int sayDiv(@PathVariable int c,@PathVariable int d){
        return  c / d;
    }
    @GetMapping("/oddeven/{a}/{b}")
    public String sayOddEven(@PathVariable int a, @PathVariable int b) {
        int sum = a + b;
        if(sum % 2 == 0)
            return "Sum : " + sum + " is Even";
        else
            return "Sum : " + sum + " is Odd";
    }
    @GetMapping("/hello/{name}")
    public String sayName(@PathVariable String name) {

        if(name.equalsIgnoreCase("subasri"))
            return "My name is Subasri";
        else
            return "I Don't Know!!!!";
    }
    @GetMapping("/climate/{a}")
    public String sayClimate(@PathVariable int a){
        if(a<0)
            return "Shivering";
        else if (a>=0 && a<15)
            return "Chill";
        else if (a>=15 && a<24)
            return "Happy";
        else if(a>=24 && a<30)
            return "Towards Hot";
        else if(a>=30 && a<32)
            return "Hotter";
        else
            return "OMG";
    }
    @GetMapping("/intro/{name}/{city}/{course}")
    public String intro(@PathVariable String name,@PathVariable String city,@PathVariable String course){
        return "Hello,I am "+name + ",from "+city+",Welcome to "+course;
    }


}

