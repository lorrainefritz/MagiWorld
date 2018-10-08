package com.magiWorld;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class GameManager {
    private Character[] tabPlayers;
    private Character player1, player2;
    private Scanner scanner;

    public GameManager() {
        scanner = new Scanner(System.in);
        player1.setNumberOfPlayers(1);//???????????????????????????????????????????????????????????????????????????????????????????????????
        player2.setNumberOfPlayers(2);//???????????????????????????????????????????????????????????????????????????????????????????????????
    }

    /**
     * Display introduction
     */
    public void displayIntroduction() {
        System.out.println("Bienvenue à MagiWorld");
    }

    /**
     * Display all available classes.
     */
    public void displayAvailableClasses() {
        System.out.println("Veuillez choisir la classe de votre personnage ");
        System.out.println("1 - Guerrier");
        System.out.println("2 - Roublard");
        System.out.println("3 - Sorcier");
    }


    /**
     * Display a Selected Character
     *
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
                System.out.println("Hey! Mais en fait cette classe de perso n'a pas encore été programmée!\n");
                return null;
        }
    }

    /**
     * Initialize players
     *
     * @param tabPlayers
     */
    //???????????????????????????????????????????????????????????????????????????????????????????????????
    // !!!!!!!!!! attention à partir d'ici j'ai mis les joueurs dans un tableau => donc tous les appels de méthodes sont sensés passer par ce tableau
    // MAIS pour le moment ne fonctionne pas
    public void initializePlayers(Character[] tabPlayers) {// en paramètres on utilise player pour pouvoir gérer les players => astuce
        tabPlayers[0] = player1;
        tabPlayers[1] = player2;
        for (int i = 0; i < tabPlayers.length; i++) {
            try {
                chooseClass(scanner.nextInt());
            } catch (InputMismatchException e) {
                System.out.println("Merci de choisir entre 1 2 ou 3 svp ;)");
            }
            while (tabPlayers[i].characteristicsChecker() == false) {
                try {
                    System.out.println("Veuillez saisir sa force");
                    tabPlayers[i].setStrength(scanner.nextInt());
                    System.out.println("Veuillez saisir son agilité");
                    tabPlayers[i].setAgility(scanner.nextInt());
                    System.out.println("Veuillez saisir son intelligence");
                    tabPlayers[i].setIntelligence(scanner.nextInt());
                } catch (InputMismatchException e) {
                    System.out.println("Hey! les stats du perso doivent être égales à ton niveau\n" +
                            "tu es de niveau " + tabPlayers[i].getLevel() + "tu as donc " + tabPlayers[i].getLevel() + "à attribuer ^^");
                }
            }
        }
    }

        //???????????????????????????????????????????????????????????????????????????????????????????????????
        /**
         * Players attack
         * @param nbOfAttack
         */

        public void playersAttacks (int nbOfAttack){
            for (int i = 0; i < tabPlayers.length; i++) {
                System.out.println("Joueur " + tabPlayers[i].getNumberOfPlayers() + " ,choisit ton attaque : \n" +
                        "1 - Attaque Basique \n  2- Attaque Spéciale");
                do {
                    switch (nbOfAttack = scanner.nextInt()) { // normalement il faut un try catch autour?...
                        case 1:
                            tabPlayers[i].basicAttack();
                            System.out.println("Joueur" + tabPlayers[i].getNumberOfPlayers() + "Utilise " + tabPlayers[i].getAttackName() + " et fait " + tabPlayers[i].getDamages()
                                    + " de dégats.");
                            break;
                        case 2:
                            tabPlayers[i].specialAttack();
                            System.out.println("Joueur" + tabPlayers[i].getNumberOfPlayers() + "Utilise " + tabPlayers[i].getAttackName() + " et fait " + tabPlayers[i].getDamages()
                                    + " de dégats.");
                            break;
                        default:
                            System.out.println("Hey! Mais cette attaque n'est pas autorisée (pas de coups bas, attention je t'ai à l'oeil...)\n Merci de saisir 1 ou 2 ;)");
                    }
                } while (tabPlayers[i].getLife() > 0);
            }
        }
    }
