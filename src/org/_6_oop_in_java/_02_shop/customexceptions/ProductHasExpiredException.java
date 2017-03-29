package org._6_oop_in_java._02_shop.customexceptions;


public class ProductHasExpiredException extends ProductManagementException{
    public ProductHasExpiredException() {
        super("This product is past its expiration date");
    }
}
