package com.magiWorld;

public class Thief extends Character {
    public Thief(){
        super(0, 0, 0, 0);
        setDescriptionCharacter("(whispering) je suis le roublard : moins fort, penses à ma discretion bon sang!\n");
        setNumberOfClass(2);
    }
    public Thief(int level, int strength, int agility, int intelligence) {
        super(level, strength, agility, intelligence);
        setDescriptionCharacter("(whispering) je suis le roublard : moins fort, penses à ma discretion bon sang!\n");
        setNumberOfClass(2);
    }
    /**
     * Run process for a basic attack.
     */

    @Override
    public int basicAttack() {
        setAttackName("Coup de dague furtif");
        setDamages(getAgility());
        return getAgility();
    }
    /**
     * Run process for a special attack.
     */

    @Override
    public int specialAttack() {
        setAttackName("Furtivité");
        int bonus =(int)Math.round(((double)getLevel()/2));
        setAgility(getAgility()+bonus);
        setAttackEffects("gagne "+ bonus + " d'agilité");
        return 0;
    }


}
