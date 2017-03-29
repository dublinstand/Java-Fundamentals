package org._6_oop_in_java._02_shop;

//Design a class hierarchy that models a shop.
//        •	Product – base class for all products, holds name, price, quantity and age restriction (can be None, Teenager or Adult). Implements the Buyable interface.
//        o	FoodProduct – implements the Expirable interface. Returns 70% of the price if the product expires in 15 days time.
//        o	ElectonicsProduct – base class for electronics, holds guarantee period
//        	Computer – has a guarantee period of 24 months. Returns 95% of the price if the quantity is over 1000.
//        	Appliance – has a guarantee period of 6 months. Returns 105% of the price if the quantity is less than 50.
//        •	Customer – holds name, age and balance
//        Define properties (getters and setters) for each class. Validate the data and throw exceptions where necessary.
//        Define the following interfaces:
//        •	Buyable – holds double getPrice()
//        •	Expirable – holds Date getExpirationDate()
//        Create a static class PurchaseManager. The class should hold the processPurchase(Product product, Customer customer) method that handles purchases (takes money from customer, reduces product quantity by 1).The PurchaseManager should throw exceptions with descriptive messages in the following situations:
//        •	If the product is out of stock (i.e. no quantity)
//        •	If the product has expired
//        •	If the buyer does not have enough money
//        •	If the buyer does not have permission to purchase the given product
//        Catch any exceptions in your main() method and print their message. Create several products of different types and add them to a list. Filter the list using lambda expressions by:
//        •	Expirable products and get the name of the first product with the soonest date of expiration
//        •	All products with adult age restriction and sort them by price in ascending order


import org._6_oop_in_java._02_shop.customexceptions.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) throws ProductOutOfStockException, NoPermissionToBuyException, ProductHasExpiredException, BuyerDoesNotHaveEnoughMoneyException, ParseException {
        FoodProduct cigars = new FoodProduct("420 Blaze it fgt", 6.90, 1400, AgeRestriction.ADULT, "11-11-2019");

        Customer pecata = new Customer("Pecata", 17, 30.00);

        try {
            PurchaseManager.processPurchase(cigars, pecata);
        }
        catch (ProductManagementException ex){

            System.out.println("There is an exception raised: " + ex.getMessage());
        }


        Customer gopeto = new Customer("Gopeto", 18, 0.44);

        try {
            PurchaseManager.processPurchase(cigars, gopeto);
        }
        catch (ProductManagementException ex){

        System.out.println("There is an exception raised: " + ex.getMessage());

        }

        List<Product> products = new ArrayList<Product>();

        products.add(new FoodProduct("Toothpaste Aquafresh", 5.00, 10, AgeRestriction.NONE, "2016-05-07"));
        products.add(new FoodProduct("Vita bread", 1.10, 2, AgeRestriction.ADULT, "2014-10-20"));
        products.add(new FoodProduct("7Days", 0.79, 111, AgeRestriction.TEENAGER, "2014-05-12"));
        products.add(new Computer("ExtraDelux XF 11", 699.90, 20, AgeRestriction.NONE));
        products.add(new Computer("TheBesto", 1699.90, 2, AgeRestriction.ADULT));
        products.add(new Appliance("Eldom Oven", 299.90, 60, AgeRestriction.TEENAGER));

    }
}
