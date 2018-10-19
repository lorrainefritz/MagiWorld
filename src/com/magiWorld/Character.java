package com.magiWorld;

public abstract class Character {

    private int level, strength, agility, intelligence;
    private double life;
    private String descriptionCharacter;
    private int numberOfPlayers;
    private int characteristicsMax;
    private String attackName;
    private int damages;


    public Character(int level, int strength, int agility, int intelligence) {
        this.level = level;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        life = 5 * level;
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
     * Description of the Character.
     */
    public String toString() {
        return descriptionCharacter + "Je suis le Joueur " + numberOfPlayers + ", je suis niveau " + level + ", je possède "
                + life + " de vitalité, " + strength + " de force, " + agility + " d'agilité et " + intelligence + " d'intelligence.";
    }

    /**
     * Check characteristics sum.
     */
    public boolean characteristicsChecker() {
      int charactSum = strength + agility + intelligence;
        if (charactSum != level || charactSum == 0) {
          if (charactSum != 0) {
              System.out.println("Attention la somme de tes stats doit être égale à ton niveau!");
            }
            return false;
       }
       return true;
    }

    /**
     * Check level
     */
    public boolean levelChecker() {
        if (level > 100 || level < 1) { // changer les get en simplement level? Enfin ça marche donc pas touche
            if (level != 0 || level==0) {
                System.out.println("Le niveau doit être compris entre 1-100");
            }
            return false;
        }
        return true;
    }


    /**
     * getters and setters.
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

    public int getDamages() {
        return damages;
    }

    public void setDamages(int damages) {
        this.damages = damages;
    }

    public String getAttackName() {
        return attackName;
    }

    public void setAttackName(String attackName) {
        this.attackName = attackName;
    }
}
