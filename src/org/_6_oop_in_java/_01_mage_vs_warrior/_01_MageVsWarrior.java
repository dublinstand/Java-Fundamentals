package org._6_oop_in_java._01_mage_vs_warrior;

//Design a simple program that simulates a battle between a mage and a warrior.
//Both characters have similar features as well as some unique abilities.
//Both classes have:
//        •	Health
//        •	Power
//        •	Energy
//        •	AttackCost
//        •	Name
//        Both classes can:
//        •	Attack
//        •	Respond to attack


import org._6_oop_in_java._01_mage_vs_warrior.exceptions.OutOfEnergyException;

public class _01_MageVsWarrior {

    public static void main(String[] args) {
        GameCharacter peshoTheWarrior = new Warrior("Pesho");
        GameCharacter goshoTheMage = new Mage("Gosho");

        final double THRESHOLD = 0.5;

        int roundCount = 0;

        while (true) {
            System.out.println("Round: " + ++roundCount);
            boolean randomHitter = Math.random() < THRESHOLD;

            try {
                if (randomHitter) {
                    peshoTheWarrior.attack(goshoTheMage);
                    goshoTheMage.attack(peshoTheWarrior);
                } else {
                    goshoTheMage.attack(peshoTheWarrior);
                    peshoTheWarrior.attack(goshoTheMage);
                }
            } catch (OutOfEnergyException e) {
                e.printStackTrace();
                break;
            }
        }

        System.out.println("The Battle is over");

        if (goshoTheMage.getHealth() > peshoTheWarrior.getHealth()) {
            System.out.println(goshoTheMage.getName() + " has more health");
        } else {
            System.out.println(peshoTheWarrior.getName() + " has more health");
        }

    }
}


