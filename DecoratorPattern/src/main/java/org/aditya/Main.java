package org.aditya;

import org.aditya.Pizza.BasePizza;
import org.aditya.Pizza.MargarhitaPizza;
import org.aditya.Toppings.ExtraCheese;
import org.aditya.Toppings.Mushroom;

/*
Decorator pattern always has is-a and has-a relationship
 */
public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new ExtraCheese(new Mushroom(new MargarhitaPizza()));
        int cost = pizza.cost();
        System.out.println(cost);
    }

}