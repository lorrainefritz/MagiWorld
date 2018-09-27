package com.magiWorld;

public class Warrior extends Character {
    private String warriorDescription ="Woarg moi grand guerrier élu de Crom : où moi taper? ";
    private int damages;
    private double malus = 0;

    public Warrior(int level, int strength, int agility, int intelligence) {
        super(level, strength, agility, intelligence);
        setDescriptionCharacter(warriorDescription);
    }

    /**
     * Run process for a basic attack.
     */
    @Override
    public String basicAttack() {
        damages = getStrength();
        return null; // le retour est clairement louche -_-

    }

     /**
     * Run process for a special attack.
     */

    @Override
    public String specialAttack() {
        damages = 2*getStrength();
        malus = getLife()-((double)getStrength()/2);
       setLife(malus);
        return null;
    }

    public int getDamages() {
        return damages;
    }

    public void setDamages(int damages) {
        this.damages = damages;
    }

    public double getMalus() {
        return malus;
    }

}
