package com.magiWorld;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class GameManager {
    private Character player1, player2;
    int nbOfAttack, nbOfClass;


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
    public Character chooseClass( int nbOfClass) {
        switch (nbOfClass) {
            case 1:
                System.out.println("Vous avez choisi le Guerrier");//
                return new Warrior();
            case 2:
                System.out.println("Vous avez choisi le Roublard");
                return new Thief();
            case 3:
                System.out.println("Vous avez choisi le Sorcier");
                return new Wizard();
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

            } catch (InputMismatchException e) {
                System.out.println("Merci de saisir un entier compris entre 1 et 100 ");

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
        boolean bool;
        try {
            do {
                switch (nbOfAttack = scanner.nextInt()) {
                    case 1:
                        player.basicAttack();
                        System.out.println("Joueur " + player.getNumberOfPlayers() + " Utilise " + player.getAttackName());
                        bool = true;
                        break;
                    case 2:
                        player.specialAttack();
                        System.out.println("Joueur " + player.getNumberOfPlayers() + " Utilise " + player.getAttackName() );
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
        int i = 1;
        // INTRO
        displayIntroduction();
        //INITILISATION DE PERSO
        try {
            displayAvailableClasses();
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
        //BOUCLE DE COMBAT
        do {
            if (player1.getLife() > 0 && player2.getLife() > 0) {
                System.out.println("\nround n° " + i);
                System.out.println("\nLa vie du joueur 1 est de " + player1.getLife());
                playersAttacks(player1);
                if (nbOfClass == 1 || nbOfAttack == 1) {
                    player2.setLife(player2.getLife() - player1.getDamages());
                    System.out.println(" et fait " + player1.getDamages()
                            + " de dégats.");
                } else {
                    System.out.println("Ok");
                }
            }
            if (player2.getLife() > 0) {
                System.out.println("\nLa vie du joueur 2 est de " + player2.getLife());
                playersAttacks(player2);
                if (nbOfClass == 1 || nbOfAttack == 1) {
                    player1.setLife(player1.getLife() - player2.getDamages());
                    System.out.println(" et fait " + player2.getDamages()
                            + " de dégats.");
                } else {
                    System.out.println("Ok");
                }
                i++;
            }
        } while (player1.getLife() > 0 && player2.getLife() > 0);
        // FIN DU JEU
        System.out.println("Fin du jeu");
        if (player1.getLife() > 0) {
            System.out.println("Le joueur 1 est victorieux");
        } else {
            System.out.println("Le joueur 2 est victorieux");
        }
        System.out.println("\n" +
                "                o    /\\-*****-/\\     o\n" +
                "                 \\  (  .    .  )    /\n" +
                "                  \\    === 0 ===   /\n");
    }

}
