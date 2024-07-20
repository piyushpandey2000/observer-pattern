package org.ppan.decorator;

public abstract class Beverage {
    protected String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract int cost();
}
