package com.magiWorld;

public class Warrior extends Character {
    private String warriorDescription ="Woarg je suis le guerrier";

    public Warrior(int level, int strength, int agility, int intelligence) {
        super(level, strength, agility, intelligence);
        setDescriptionCharacter(warriorDescription);
    }

    /**
     * Run process for a basic attack.
     */
    @Override
    public String basicAttack() {
        return null;
    }
    /**
     * Run process for a special attack.
     */

    @Override
    public String SpecialAttack() {
        return null;
    }

}
