package org._6_oop_in_java._02_shop;

public class Computer extends ElectronicsProduct {

    //has a guarantee period of 24 months. Returns 95% of the price if the quantity is over 1000.
    public Computer(String name, double price, int quantity, AgeRestriction ageRestriction) {
        super(name, price, quantity, ageRestriction);
        this.setGuaranteePeriod(24);
        this.isQuantityOver();
    }

    @Override
    protected void isQuantityOver() {
        if (this.getQuantity() > 1000) {
            this.setPrice(getPrice() * 0.95);
        }
    }
}
