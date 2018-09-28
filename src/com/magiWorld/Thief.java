package com.magiWorld;

public class Thief extends Character {
    private String thiefDescription ="(whispering) je suis le roublard : moins fort, penses à ma discretion bon sang!";
    public Thief(int level, int strength, int agility, int intelligence) {
        super(level, strength, agility, intelligence);
        setDescriptionCharacter(thiefDescription);
    }
    /**
     * Run process for a basic attack.
     */

    @Override
    public int basicAttack() {
        return getAgility();
    }
    /**
     * Run process for a special attack.
     */

    @Override
    public int specialAttack() {
        int bonus =(int)Math.round(((double)getLevel()/2));
        setAgility(getAgility()+bonus);
        return 0; // choix temporaire
    }


}
