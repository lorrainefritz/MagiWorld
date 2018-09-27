package com.magiWorld;

public abstract class Character {

    private int level, strength, agility, intelligence;
    private int life;
    private String descriptionCharacter;
    private int numberOfPlayers;


    public Character(int level, int strength, int agility, int intelligence) {
        this.level = level;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        life = 5*level;// moche mais temporaire : permet de mettre la vie à fois 5
        ++numberOfPlayers; // ne fonctionne pas -_- de toute façon un compteur général serait plus propre
    }


    /**
     * Run process for a basic attack.
     */
    public abstract String basicAttack();
    /**
     * Run process for a special attack.
     */
    public abstract String specialAttack();

    /**
     *Description of the Character.
     */
    public String toString(){
        return   descriptionCharacter+ " Joueur "+ numberOfPlayers+ ", je suis niveau "+ level+ ", je possède "
                + life+ " de vitalité, "+ strength+ " de force, "+ agility+ " d'agilité et "+ intelligence+ " d'intelligence";
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

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }
}
