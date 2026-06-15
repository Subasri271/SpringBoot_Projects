package com.example.demo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calc
{
    @GetMapping("/calc/{a}/{b}")
    public String sayCall(@PathVariable int a ,@PathVariable int b){
        StringBuilder sb=new StringBuilder();
        sb.append("add").append(a+b).append("\n");
        sb.append("sub").append(a-b).append("\n");
        sb.append("mul").append(a*b).append("\n");
        if(b!=0){
            sb.append("quo").append(a/b).append("\n");
            sb.append("rem").append(a%b).append("\n");
        }else{
            sb.append("quo Division by zero not allowed\n");
            sb.append("rem Division by zero not allowed\n");
        }
        return "<pre>" +sb.toString() + "</pre>";//<pre> preserves formatting
    }
}
