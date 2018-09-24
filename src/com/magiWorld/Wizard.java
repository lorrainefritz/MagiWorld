package com.magiWorld;

public class Wizard extends Character {
    public Wizard(int level, int life, int strength, int agility, int intelligence) {
        super(level, life, strength, agility, intelligence);
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
