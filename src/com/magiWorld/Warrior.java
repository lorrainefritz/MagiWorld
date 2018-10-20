package com.magiWorld;

public class Warrior extends Character {

    public Warrior(){
        super(0, 0, 0, 0);
        setDescriptionCharacter("Woarg moi grand guerrier élu de Crom : où moi taper?\n");
        setNumberOfClass(1);
    }

    public Warrior(int level, int strength, int agility, int intelligence) {
        super(level, strength, agility, intelligence);
        setDescriptionCharacter("Woarg moi grand guerrier élu de Crom : où moi taper?\n");
        setNumberOfClass(1);
    }

    /**
     * Run process for a basic attack.
     */
    @Override
    public int basicAttack() {
        setAttackName("Coup d’Épée");
        setDamages(getStrength());
        return getStrength();

    }

     /**
     * Run process for a special attack.
     */

    @Override
    public int specialAttack() {
        setAttackName("Coup de Rage");
        int damages = 2*getStrength();
       setDamages(damages);
       int malus = (int)Math.round(((double)getStrength()/2));
       setLife(getLife()-malus);
       setAttackEffects(" perd "+ malus +" PV ");
        return damages;
    }

}
