package org._6_oop_in_java._02_shop.customexceptions;


public class ProductOutOfStockException extends ProductManagementException{
    public ProductOutOfStockException() {
        super("The product you want to buy is out of stock");
    }
}
