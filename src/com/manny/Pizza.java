package com.manny;

public class Pizza {
    private int pizzasMade;
    private boolean pineapple;

    public Pizza(int pizzasMade, boolean pepperoni) {
        this.pizzasMade = 0;
        this.pineapple = pepperoni;
    }

    public int makePizza(int pizza){
        int pizzaToMake = pizza;
        this.pizzasMade += pizzaToMake;
        return pizzaToMake;
    }

    public int getPizzasMade() {
        return pizzasMade;
    }
}
