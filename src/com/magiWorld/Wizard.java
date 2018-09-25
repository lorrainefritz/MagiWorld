package com.magiWorld;

public class Wizard extends Character {
    private String wizardDescription ="Abracadabra je suis le sorcier : bon sérieusement qu'est ce qu'on brûle aujourd'hui?";
    public Wizard(int level, int strength, int agility, int intelligence) {
        super(level,  strength, agility, intelligence);
        setDescriptionCharacter(wizardDescription);
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
