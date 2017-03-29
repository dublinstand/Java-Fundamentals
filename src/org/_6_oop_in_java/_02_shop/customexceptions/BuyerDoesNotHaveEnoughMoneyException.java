package org._6_oop_in_java._02_shop.customexceptions;


public class BuyerDoesNotHaveEnoughMoneyException extends ProductManagementException{
    public BuyerDoesNotHaveEnoughMoneyException() {
        super("Buyer does not have sufficient funds");
    }
}
