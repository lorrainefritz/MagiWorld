package com.magiWorld;

public abstract class Character {
    private int level, strength, agility, intelligence, numberOfPlayers;
    private int life = 5*level; // moche mais temporaire : penser à le mettre ailleurs
    private String descriptionCharacter;
    private String descriptionCharacterTot = descriptionCharacter+ " Joueur "+ numberOfPlayers+ "niveau, "+ level+ "je possède "
            + life+ " de vitalité, "+ strength+ " de force, "+ agility+ " d'agilité et "+ intelligence+ " d'intelligence";



    public Character(int level, int strength, int agility, int intelligence) {
        this.level = level;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        numberOfPlayers++;
    }

    /**
     * Run process for a basic attack.
     */
    public abstract String basicAttack();
    /**
     * Run process for a special attack.
     */
    public abstract String SpecialAttack();

    /**
     *Description of the Character.
     */
    public String toString(){
        return descriptionCharacterTot ;
    }

    /**
     *getters and setters .
     */

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public String getDescriptionCharacter() {
        return descriptionCharacter;
    }

    public void setDescriptionCharacter(String descriptionCharacter) {
        this.descriptionCharacter = descriptionCharacter;
    }
}
