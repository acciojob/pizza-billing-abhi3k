package com.driver;

public class Main {
  public static void main(String[] args) {
    DeluxePizza dp = new DeluxePizza(true);
    System.out.println(dp.getPrice("extra cheese"));

    dp.addTakeaway();

    dp.addExtraCheese();

    dp.addTakeaway();

    System.out.println(dp.getBill());


    Pizza p = new Pizza(false);
    System.out.println(p.getPrice("base"));

    p.addExtraCheese();

    p.addExtraToppings();

    p.addTakeaway();
    System.out.println(p.getBill());

    DeluxePizza dp1 = new DeluxePizza(false);
    dp1.addExtraToppings();
    dp1.addTakeaway();
    System.out.println(dp1.getBill());

  }
}