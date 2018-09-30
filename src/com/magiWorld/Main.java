package com.magiWorld;

import java.util.stream.Collector;

public class Main {
    public static void main(String[] args) {
       Character warrior1 = new Warrior(1, 1, 0, 0);
       //Character warrior2 = new Warrior(2, 2, 0, 0);

        Character thief= new Thief(1, 0, 1, 0);
        Character wizard= new Wizard(4, 0, 0, 4);

        //System.out.println(warrior2);
        System.out.println(thief);
       // System.out.println(wizard);
        System.out.println(thief.getAgility());
        thief.specialAttack();
        System.out.println(thief.getAgility());
        thief.specialAttack();
        System.out.println(thief.getAgility());

        System.out.println(thief);
        /* System.out.println(wizard);
        System.out.println(wizard.getLife());
        wizard.setLife(19);
        System.out.println(wizard.getLife());
        wizard.specialAttack();
        System.out.println(wizard.getLife());
*/
        ;

        warrior1.characteristicsChecker();
        wizard.characteristicsChecker();
        thief.characteristicsChecker();

    }
}
