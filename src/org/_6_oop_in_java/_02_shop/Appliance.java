package org._6_oop_in_java._02_shop;

public class Appliance extends ElectronicsProduct {
    public Appliance(String name, double price, int quantity, AgeRestriction ageRestriction) {
        super(name, price, quantity, ageRestriction);
        this.setGuaranteePeriod(6);
        this.isQuantityOver();
    }

    @Override
    protected void isQuantityOver() {
        if (this.getQuantity() < 50) {
            this.setPrice(getPrice() * 1.05);
        }
    }
}
