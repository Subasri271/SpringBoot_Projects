package com.example.coffee;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CoffeeService {
    private List<Coffee> orders = new ArrayList<>();
    private int idCounter = 1;
    public Coffee orderCoffee( Coffee request) {
        request.setId(idCounter++);
        orders.add(request);
        return request;
    }
     public List<Coffee> getOrders() {
        return orders;
    }
}
