package org._3_loopsmethodsclasses.excel;


import java.time.LocalDate;

public class Office implements Comparable<Office> {
    private String officeName;
    private LocalDate date;
    private String description;
    private double income;
    private double vat;
    private double totalIncome;

    public Office(String officeName, LocalDate date, String description, double income) {
        this.officeName = officeName;
        this.date = date;
        this.description = description;
        this.income = income;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    private double getVat(){
        return this.income * 0.2;
    }

    public double getTotalIncome(){
        return this.getVat() + this.income;
    }

    @Override
    public String toString() {
        return String.format("%s Total -> %.2f", this.getOfficeName(), this.getTotalIncome()) ;
    }


    @Override
    public int compareTo(Office o) {
        return this.getOfficeName().compareTo(o.getOfficeName());
    }
}
