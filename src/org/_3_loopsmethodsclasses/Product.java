package org._3_loopsmethodsclasses;

class Product implements Comparable<Product>{
    private String name;
    private double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    @Override
    public int compareTo(Product product) {
        if (this.price > product.getPrice()) {
            return 1;
        } else if (this.price < product.getPrice()) {
            return -1;
        }
        return 0;
    }
}