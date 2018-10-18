package com.magiWorld;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class GameManager {
    private Character player1, player2;


    public GameManager() {
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
     * @param player
     */

    public Character initializePlayers(Character player) {
        while (player.characteristicsChecker() == false) {
            try {
                Scanner scanner = new Scanner(System.in);
                while (player.levelChecker() == false) {
                    System.out.println("Veuillez saisir son niveau");
                    player.setLevel(scanner.nextInt());
                }
                player.setLife(player.getLevel() * 5);
                System.out.println("Veuillez saisir sa force");
                player.setStrength(scanner.nextInt());
                System.out.println("Veuillez saisir son agilité");
                player.setAgility(scanner.nextInt());
                System.out.println("Veuillez saisir son intelligence");
                player.setIntelligence(scanner.nextInt());
                return player;
            } catch (InputMismatchException e) {
                System.out.println("Merci de saisir un entier compris entre 1 et 100");
                return null;
            }
        }
        return player;
    }


    /**
     * Players attack
     *
     * @param player
     */

    public void playersAttacks(Character player) {
        System.out.println("Joueur " + player.getNumberOfPlayers() + " Choisit ton attaque : \n" +
                "1 - Attaque Basique \n  2- Attaque Spéciale");
        Scanner scanner = new Scanner(System.in);
        int nbOfAttack;
        boolean bool;
        try {
            do {
                switch (nbOfAttack = scanner.nextInt()) {
                    case 1:
                        player.basicAttack();
                        System.out.println("Joueur " + player.getNumberOfPlayers() + " Utilise " + player.getAttackName() + " et fait " + player.getDamages()
                                + " de dégats.");
                        bool = true;
                        break;
                    case 2:
                        player.specialAttack();
                        System.out.println("Joueur " + player.getNumberOfPlayers() + " Utilise " + player.getAttackName() + " et fait " + player.getDamages()
                                + " de dégats.");
                        bool = true;
                        break;
                    default:
                        System.out.println("Hey! Mais cette attaque n'est pas autorisée (pas de coups bas, attention je t'ai à l'oeil...)\n Merci de saisir 1 ou 2 ;)");
                        bool = false;
                }
            } while (bool != true);
        } catch (InputMismatchException e) {
            System.out.println("Nop merci de saisir 1 ou 2...");
        }
    }

    /**
     * Run process for game
     */

    public void runGame() {
        Scanner scanner = new Scanner(System.in);
        displayIntroduction();
        displayAvailableClasses();
        try {
            player1 = initializePlayers(chooseClass(scanner.nextInt()));
            player1.setNumberOfPlayers(1);
            System.out.println(player1);
            displayAvailableClasses();
            player2 = initializePlayers(chooseClass(scanner.nextInt()));

            player2.setNumberOfPlayers(2);
            System.out.println(player2);
        } catch (InputMismatchException e) {
            System.out.println("Merci de rentrer un chiffre valide");
        }

        while (player1.getLife() > 0 && player2.getLife() > 0) {
            System.out.println("La vie du joueur 1 est de " + player1.getLife());
            playersAttacks(player1);
            player2.setLife(player2.getLife() - player1.getDamages());
            System.out.println("Vie du joueur 2 " + player2.getLife());
            playersAttacks(player2);
            player1.setLife(player1.getLife() - player2.getDamages());
        }
        System.out.println("Fin du jeu");
    }

    public Character getPlayer1() {
        return player1;
    }

    public void setPlayer1(Character player1) {
        this.player1 = player1;
    }
}
