package com.driver;

public class DeluxePizza extends Pizza {
     public DeluxePizza(Boolean isVeg) {
        super(isVeg);
    }

    @Override
    public String getBill() {
        System.out.println(super.buy);
         super.buy += super.getPrice("extra topping");
        System.out.println(super.buy);
         super.buy += super.getPrice("extra cheese");
        System.out.println(super.buy);
         System.out.println("Deluxe Pizza comes with extra cheese & topping");
        System.out.println("Extra Toppings added [ cost : Rs."+super.getPrice("extra topping")+" ]");
        System.out.println("Extra Cheese added [ cost : Rs."+super.getPrice("extra cheese")+" ]");
        System.out.println(super.buy);
        return super.getBill();
    }
}
