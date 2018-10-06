package com.magiWorld;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameManager {
    private Character player1, player2;
    private Scanner scanner;

    public GameManager() {
         scanner= new Scanner(System.in);
    }

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
    public Character chooseClass(int nbOfClass) {
        switch (nbOfClass) {
            case 1:
                System.out.println("Vous avez choisi le Guerrier");// texte temporaire
                return new Warrior();
            case 2:
                System.out.println("Vous avez choisi le Roublard");
                return new Thief(0, 0, 0, 0);// rajouter un constructeur
            case 3:
                System.out.println("Vous avez choisi le Sorcier");
                return new Wizard(0, 0, 0, 0);
            default:
                System.out.println("Hey! Mais en fait cette classe de perso n'a pas encore été programmée!\n" + // => intégrer ça dans une Exception
                        "Merci de choisir (pour le moment) entre 1 2 ou 3 svp ;)");
                return null;
        }
    }
        /**
         * Initialize players
         */
        public void initializePlayers(){// en paramètres on utilise player pour pouvoir gérer les players
            player1 = chooseClass(scanner.nextInt());// mettre le scanner en paramètre          // gestion des exceptions de Scanner => cf doc
            while(player1.characteristicsChecker()==false){
                System.out.println("Veuillez saisir sa force ");
                setStrength(scanner.nextInt());
                System.out.println("Veuillez saisir son agilité");
                setAgility(scanner.nextInt());
                System.out.println("Veuillez saisir son intelligence ");
                setIntelligence(scanner.nextInt());
            }
        }





    // do {} while (player1.getLife>0 || player.getLife>0)


}
