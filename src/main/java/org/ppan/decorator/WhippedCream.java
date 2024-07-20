package org.ppan.decorator;

public class WhippedCream extends CondimentDecorator {
    private final Beverage base;

    public WhippedCream(Beverage base) {
        this.base = base;
    }

    @Override
    public int cost() {
        return base.cost() + 2;
    }

    @Override
    public String getDescription() {
        return base.getDescription() + ", whipped cream";
    }
}
