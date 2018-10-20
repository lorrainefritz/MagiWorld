package com.magiWorld;

public class Wizard extends Character {
    public Wizard(){
        super(0, 0, 0, 0);
        setDescriptionCharacter("Abracadabra je suis le sorcier : bon sérieusement qu'est ce qu'on brûle aujourd'hui?\n");
        setNumberOfClass(3);
    }

    public Wizard(int level, int strength, int agility, int intelligence) {
        super(level, strength, agility, intelligence);
        setDescriptionCharacter("Abracadabra je suis le sorcier : bon sérieusement qu'est ce qu'on brûle aujourd'hui?\n");
        setNumberOfClass(3);

    }

    /**
     * Run process for a basic attack.
     */

    @Override
    public int basicAttack() {
        setAttackName("Poule de Feu");
        setDamages(getIntelligence());
        return getIntelligence();
    }

    /**
     * Run process for a special attack.
     */
    @Override
    public int specialAttack() {
        setAttackName("Soins");
        int maxLife = 5*getLevel();
        int bonus = (int) Math.round(((double) getIntelligence()/2)); // même combat que dans la classe warrior
        if ((bonus + getLife())<= maxLife) { // il existe sans doute des manières plus belles de le formuler...
            setLife((getLife() + bonus));
         } else {
            setLife(maxLife);
        }
        setAttackEffects("gagne "+ bonus + " PV");
         return 0;
    }


}
