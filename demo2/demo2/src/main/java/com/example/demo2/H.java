package com.example.demo2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class H {
    @GetMapping("/myhtml")
    public String sayHello(){
        return  "<h1 style=\"background-color:hotpink\" > SATURDAY</h1> "+
                "<img src='/cat.jpg' width='300' height='400'></img>"+"                    "+
                "<img src=\"https://cdn.pixabay.com/photo/2016/08/26/12/03/sunflower-1621990_960_720.jpg\" width='300' height='400'></img>";
    }

}
