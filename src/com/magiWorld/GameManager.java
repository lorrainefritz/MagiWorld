package com.magiWorld;

public class GameManager {

    /**
     * Display introduction
     */
    public void displayIntroduction(){
    System.out.println("Bienvenue à MagiWorld");
    }

    /**
     * Display all available classes.
     */
    public void displayAvailableClasses(){
        System.out.println("Veuillez choisir la classe de votre personnage ");
        System.out.println("1 - Guerrier");
        System.out.println("2 - Roublard");
        System.out.println("3 - Sorcier");
    }

    /**
     * Display a Selected Character
     * @param nbOfClass
     */
    public void chooseClass(int nbOfClass){
        switch (nbOfClass){
            case 1 :
                System.out.println("Vous avez choisi le Guerrier");
             break;
            case 2 :
                System.out.println("Vous avez choisi le Roublard");
             break;
            case 3 :
                System.out.println("Vous avez choisi le Sorcier");
             default:
                 System.out.println("Hey! Mais en fait cette classe de perso n'a pas encore été programmée!\n" +
                         "Merci de choisir (pour le moment) entre 1 2 ou 3 svp ;)");
        }

    }


}
