package com.example.coffee;

public class Coffee {
    private int id;
    private String customerName;
    private String coffeeType;

    public int getId() {
        return id;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getCoffeeType() {
        return coffeeType;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setCoffeeType(String coffeeType) {
        this.coffeeType = coffeeType;
    }
}
