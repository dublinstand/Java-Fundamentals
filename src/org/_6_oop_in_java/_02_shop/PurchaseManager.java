package org._6_oop_in_java._02_shop;


import org._6_oop_in_java._02_shop.customexceptions.BuyerDoesNotHaveEnoughMoneyException;
import org._6_oop_in_java._02_shop.customexceptions.NoPermissionToBuyException;
import org._6_oop_in_java._02_shop.customexceptions.ProductHasExpiredException;
import org._6_oop_in_java._02_shop.customexceptions.ProductOutOfStockException;

public class PurchaseManager {

    public static void PurchaseManager() {
    }

    static void processPurchase(Product product, Customer customer) throws ProductOutOfStockException, ProductHasExpiredException, NoPermissionToBuyException, BuyerDoesNotHaveEnoughMoneyException {
        double newBalance = customer.getBalance() - product.getPrice();
        customer.setBalance(newBalance);

        int newQuantity = product.getQuantity() - 1;
        product.setQuantity(newQuantity);

        if (product.getQuantity() < 1) {
            throw new ProductOutOfStockException();
        } else if ((product instanceof FoodProduct) && (((FoodProduct) product).isExpired())) {
            throw new ProductHasExpiredException();
        } else if (customer.getBalance() < product.getPrice()) {
            throw new BuyerDoesNotHaveEnoughMoneyException();
        } else if (product.getAgeRestriction() == AgeRestriction.ADULT && customer.getAge() < 18) {
            throw new NoPermissionToBuyException();
        }

    }
}
