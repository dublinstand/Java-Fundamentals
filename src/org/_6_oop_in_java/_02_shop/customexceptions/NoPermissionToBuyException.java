package org._6_oop_in_java._02_shop.customexceptions;


public class NoPermissionToBuyException extends ProductManagementException{

    public NoPermissionToBuyException() {
        super("You must be over 18 to buy this product!");
    }
}
