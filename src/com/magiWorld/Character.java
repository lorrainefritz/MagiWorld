package com.magiWorld;

public abstract class Character {

    private int level, strength, agility, intelligence;
    private double life;
    private String descriptionCharacter;
    private int numberOfPlayers;
    private int characteristicsMax;


    public Character(int level, int strength, int agility, int intelligence) throws CharacterException{ //on contrôle dès la construction
        characteristicsChecker();
        this.level = level;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        life = 5*level;
        characteristicsMax = level;
    }



    /**
     * Run process for a basic attack.
     */
    public abstract int basicAttack();
    /**
     * Run process for a special attack.
     */
    public abstract int specialAttack();

    /**
     *Description of the Character.
     */
    public String toString(){
        return   descriptionCharacter+ " Je suis le Joueur "+ numberOfPlayers+ ", je suis niveau "+ level+ ", je possède "
                + life+ " de vitalité, "+ strength+ " de force, "+ agility+ " d'agilité et "+ intelligence+ " d'intelligence.";
    }
    /**
     * Check characteristics sum.
     */
    public void characteristicsChecker(){ // pour l'instant est en void
        int charactSum = getStrength()+getAgility()+getIntelligence();
        if (charactSum>characteristicsMax||charactSum<0) throw new CharacterException();
    }

    /**
     *getters and setters.
     */

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getLife() {
        return life;
    }

    public void setLife(double life) {
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

    public int getCharacteristicsMax() {
        return characteristicsMax;
    }

    public void setCharacteristicsMax(int characteristicsMax) {
        this.characteristicsMax = characteristicsMax;
    }
}
