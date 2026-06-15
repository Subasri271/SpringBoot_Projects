package com.example.coffee;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/coffee")
public class CoffeeController {
    private final CoffeeService service;
    public CoffeeController(CoffeeService service) {
        this.service = service;
    }
    @PostMapping
    public Coffee orderCoffee(@RequestBody Coffee request) {
        return service.orderCoffee(request);
    }
    @GetMapping
    public List<Coffee> getOrders() {
        return service.getOrders();
    }
}