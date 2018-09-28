package com.magiWorld;

public class Wizard extends Character {
    private String wizardDescription = "Abracadabra je suis le sorcier : bon sérieusement qu'est ce qu'on brûle aujourd'hui?";

    public Wizard(int level, int strength, int agility, int intelligence) {
        super(level, strength, agility, intelligence);
        setDescriptionCharacter(wizardDescription);
    }

    /**
     * Run process for a basic attack.
     */

    @Override
    public int basicAttack() {
        return getIntelligence();
    }

    /**
     * Run process for a special attack.
     */
    @Override
    public int specialAttack() {
        int maxLife = 5*getLevel();
        int bonus = (int) Math.round(((double) getIntelligence()/2)); // même combat que dans la classe warrior
        if ((bonus + getLife())<= maxLife) { // il existe sans doute des manières plus belles de le formuler...
            setLife((getLife() + bonus));
         } else {
            setLife(maxLife);
        }
         return 0; // choix temporaire
    }


}
