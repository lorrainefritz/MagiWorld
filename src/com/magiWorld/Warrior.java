package com.magiWorld;

public class Warrior extends Character {
    private String warriorDescription ="Woarg moi grand guerrier élu de Crom : où moi taper? ";
    private int damages;
    private int mallus = 0;

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
        mallus = getLife()-(getStrength()/2);

        return null;
    }

    public int getDamages() {
        return damages;
    }

    public void setDamages(int damages) {
        this.damages = damages;
    }

    public int getMalus() {
        return mallus;
    }

    public void setMalus(int mallus) {
        this.mallus = mallus;
    }
}
