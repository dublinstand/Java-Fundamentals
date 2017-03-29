package org._6_oop_in_java._02_shop;


public class Customer {

    private String name;
    private int age;
    private double balance;

    public Customer(String name, int age, double balance){
        this.name = name;
        this.age = age;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name can not be empty");
        }

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age < 0 || age > 100){
            throw new IllegalArgumentException("Age must be between 0 and 100!");
        }

        this.age = age;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {

        if (balance < 0){
            throw new IllegalArgumentException("Balance can not be negative");
        }

        this.balance = balance;
    }
}
