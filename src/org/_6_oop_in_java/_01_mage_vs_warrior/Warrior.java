package org._6_oop_in_java._01_mage_vs_warrior;


import org._6_oop_in_java._01_mage_vs_warrior.exceptions.OutOfEnergyException;

public class Warrior extends GameCharacter {

    private static final int BASE_HEALTH = 5000;
    private static final int BASE_POWER = 200;
    private static final int BASE_ENERGY = 1000;
    private static final int BASE_ATTACK_COST = 150;
    private static final double SURGE_OF_POWER_THRESHOLD = 0.3;
    private static final double BLOCKS_THRESHOLD = 0.6;


    public Warrior(String name){
        super(BASE_HEALTH, BASE_POWER, BASE_ENERGY, BASE_ATTACK_COST, name);
    }

    @Override
    public void attack(GameCharacter other) throws OutOfEnergyException {

        if (this == other){
            throw new IllegalStateException("Cannot attack yourself");
        }

        if (this.getEnergy() < this.getAttackCost()){
            throw new OutOfEnergyException("Warrior" + this.getName() + " is out of energy. Battle over!");
        }

        boolean surgeOfPower = Math.random() < SURGE_OF_POWER_THRESHOLD;

        if (surgeOfPower){
            System.out.println("Warrior " + getName() + " is lucky. Free attack!");
        }
        else{
            this.setEnergy(this.getEnergy() - this.getAttackCost());
        }

        other.respond(getPower());
    }

    @Override
    public void respond(int damage){

        boolean hasBlocked = Math.random() < BLOCKS_THRESHOLD;

        if (hasBlocked){
            damage = damage / 2;
        }

        setHealth(getHealth() - damage);
        System.out.println("The warrior sustained " + damage + " damage!");
    }
}
