package org.aditya.Toppings;

import org.aditya.Pizza.BasePizza;

public class Mushroom extends ToppingDecorator{
    BasePizza basePizza;
    public Mushroom(BasePizza basePizza) {
        this.basePizza=basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + 20;
    }
}
