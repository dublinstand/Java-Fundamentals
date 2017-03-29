package org._6_oop_in_java._02_shop;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class FoodProduct extends Product implements Expirable {

    private Date expirationDate;

    public FoodProduct(String name, double price, int quantity, AgeRestriction ageRestriction, String expirationDate) throws ParseException {
        super(name, price, quantity, ageRestriction);

        DateFormat simpleFormat = new SimpleDateFormat("dd-MM-yyyy");
        this.expirationDate = simpleFormat.parse(expirationDate);

        isExpired();
    }

    @Override
    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        this.expirationDate = dateFormat.parse(expirationDate);
    }

    public boolean isExpired() {
        long now = new Date().getTime();
        long period = (this.getExpirationDate().getTime() - now);
        int days = (int) TimeUnit.DAYS.convert(period, TimeUnit.MILLISECONDS);

        if (days < 15 && days > 0) {
            this.setPrice(this.getPrice() * 0.7);
            return false;
        } else if (days < 0) {
            return true;
        } else {
            return false;
        }
    }
}
