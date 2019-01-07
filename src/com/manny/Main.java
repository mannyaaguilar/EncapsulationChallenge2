package com.manny;

public class Main {

    public static void main(String[] args) {

        Pizza pizza = new Pizza(20, true);
        System.out.println("Initial pizzas made = " + pizza.getPizzasMade());
        int finishedPizza = pizza.makePizza(4);
        System.out.println("Pizzas made was " + finishedPizza + ". New total pizza count is " + pizza.getPizzasMade());
        finishedPizza = pizza.makePizza(20);
        System.out.println("Pizzas made was " + finishedPizza + ". New total pizza count is " + pizza.getPizzasMade());

    }
}
