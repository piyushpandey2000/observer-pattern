package org.ppan.decorator;

public class Main {
    public static void main(String[] args) {
        Beverage whippedEspresso = new WhippedCream(new Espresso());

        System.out.println(whippedEspresso.getDescription());
        System.out.println(whippedEspresso.cost());
    }
}
