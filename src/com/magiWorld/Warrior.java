package com.magiWorld;

public class Warrior extends Character {


    public Warrior(int level, int strength, int agility, int intelligence) {
        super(level, strength, agility, intelligence);
        setDescriptionCharacter("Woarg moi grand guerrier élu de Crom : où moi taper?\n");
    }

    /**
     * Run process for a basic attack.
     */
    @Override
    public int basicAttack() {
        return getStrength();

    }

     /**
     * Run process for a special attack.
     */

    @Override
    public int specialAttack() {

       int damages = 2*getStrength();
       int malus = (int)Math.round(((double)getStrength()/2)); // version antérieure retranchait en fait une première fois de getLife, puis on recommançait dans le setLife
       setLife(getLife()-malus);
        return damages;
    }

}
