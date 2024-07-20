package org.ppan.decorator;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    public int cost() {
        return 10;
    }
}
