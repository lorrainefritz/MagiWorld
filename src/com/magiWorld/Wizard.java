package com.magiWorld;

public class Wizard extends Character {
    public Wizard(int level, int life, int strength, int agility, int intelligence) {
        super(level, life, strength, agility, intelligence);
    }

    @Override
    public String basicAttack() {
        return null;
    }

    @Override
    public String SpecialAttack() {
        return null;
    }
}
