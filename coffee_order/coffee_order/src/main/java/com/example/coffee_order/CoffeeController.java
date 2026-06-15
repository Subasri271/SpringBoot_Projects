package com.example.coffee_order;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/coffee")
public class CoffeeController {
    private final CoffeeService service;
    public CoffeeController(CoffeeService service){
        this.service=service;
    }
    @PostMapping("/{type}")
    public String orderCoffee(@PathVariable String type){
        return service.orderCoffee(type);
    }
    @GetMapping
    public List<String> getOrders(){
        return service.getOrders();
    }
}
