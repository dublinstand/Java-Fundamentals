package org._6_oop_in_java._01_mage_vs_warrior;


import org._6_oop_in_java._01_mage_vs_warrior.exceptions.OutOfEnergyException;

public class Mage extends GameCharacter{

    private static final int BASE_HEALTH = 5000;
    private static final int BASE_POWER = 150;
    private static final int BASE_ENERGY = 2500;
    private static final int BASE_ATTACK_COST = 250;
    private static final double CRITICAL_HIT_THRESHOLD = 0.5;
    private static final double TELEPORT_THRESHOLD = 0.5;


    public Mage(String name){
        super(BASE_HEALTH , BASE_POWER, BASE_ENERGY, BASE_ATTACK_COST, name);
    }

    @Override
    public void attack(GameCharacter other) throws OutOfEnergyException{

        //protect from attacking yourself
        if (other == this){
            throw new IllegalStateException("The Mage cannot attack yourself");
        }

        //if the energy used for attack is less than the energy that tha mage has - Battle over
        if (this.getEnergy() < this.getAttackCost()){
            throw new OutOfEnergyException("Mage " + this.getName() + " is out of energy. Battle over");
        }

        //if we have a critical hit If the attack is critical, we will double our damage; however,
        // it will not be a good idea to change the normal damage of the mage.
        // This is introducing a side effect and may cause problems later.
        // So, we can store the damage in a temporary variable and double it, if needed.
        int damage = this.getPower();
        boolean isCritical = Math.random() < CRITICAL_HIT_THRESHOLD;

        if (isCritical){
            System.out.println("Critical hit by the mage");
            damage = damage * 2;
        }

        //remove the energy used for the attack of the mage
        this.setEnergy(this.getEnergy() - this.getAttackCost());

        //the other character responds to our damage
        other.respond(damage);
    }

    @Override
    public void respond(int damage){

        boolean hasTeleported = Math.random() < TELEPORT_THRESHOLD;

        if (hasTeleported){
            System.out.println("The mage has teleported and evaded the attack");
        }
        else{
            this.setHealth(getHealth() - damage);
            System.out.println("Successful attack. " + damage + " damage dealt to the mage");
        }

    }

}
