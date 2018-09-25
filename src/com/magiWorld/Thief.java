package com.magiWorld;

public class Thief extends Character {
    private String thiefDescription ="(whispering) je suis le roublard";
    public Thief(int level, int strength, int agility, int intelligence) {
        super(level, strength, agility, intelligence);
        setDescriptionCharacter(thiefDescription);
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
