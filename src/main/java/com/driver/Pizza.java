package com.driver;

import java.util.HashMap;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    protected int buy;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.buy = 0;
    }

    public int getPrice(String item){
        switch(item){
            case "extra cheese":
                this.price = 80;
                break;
            case "extra topping":
                if(isVeg)
                    this.price = 70;
                else
                    this.price = 120;
                break;
            case "bag":
                this.price = 20;
                break;
            case "base":
                if (isVeg)
                    this.price = 300;
                else
                    this.price = 400;
                break;
                default:
                    this.price = 0;
                    break;

        }
        return this.price;
    }

    public void addExtraCheese(){
        this.buy += this.getPrice("extra cheese");
        System.out.println("Extra Cheese added [ cost : Rs."+this.getPrice("extra cheese")+" ]");

    }

    public void addExtraToppings(){
        this.buy += this.getPrice("extra topping");
        System.out.println("Extra Toppings added [ cost : Rs."+this.getPrice("extra topping")+" ]");
    }

    public void addTakeaway(){
        this.buy +=  this.getPrice("bag");
        System.out.println("Take away added [ cost : Rs."+this.getPrice("bag")+" ]");
    }

    public String getBill(){
        if(isVeg){
            this.buy += this.getPrice("base");
            System.out.println("Veg base added [ "+"cost : "+ this.getPrice("base")+" ]");
        }else{
            this.buy += this.getPrice("base");
            System.out.println("NoN Veg base added [ "+"cost : "+ this.getPrice("base")+" ]");
        }
        this.bill = "Total Price : "+this.buy;
        this.buy = 0;
        return this.bill;
    }
}
