package com.magiWorld;


import java.util.InputMismatchException;
import java.util.Scanner;

public class GameManager {
    private Character player1, player2;
    private int nbOfAttack;
    private int i = 1;


    public GameManager() {
    }

    /**
     * Display introduction
     */
    private void displayIntroduction() {
        System.out.println("********************************************************************************************");
        System.out.println("                        Bienvenue à MagiWorld");
        System.out.println("********************************************************************************************");
    }

    /**
     * Display all available classes.
     */
    private void displayAvailableClasses() {
        System.out.println("Veuillez choisir la classe de votre personnage ");
        System.out.println("1 - Guerrier");
        System.out.println("2 - Roublard");
        System.out.println("3 - Sorcier");
    }


    /**
     * Display a Selected Character
     *
     * @param nbOfClass the number of class that would be choosen
     */
    private Character chooseClass(int nbOfClass) {
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
     * @param player a generalistic player
     */

    private Character initializePlayers(Character player) {

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

            }catch (NullPointerException e){
                System.out.println("Merci de saisir un entier compris entre 1 et 100 OP ");
                initializePlayers(player);
            }
            catch (InputMismatchException e) {
                System.out.println("Merci de saisir un entier compris entre 1 et 100 ");
                player.setStrength(0);
                player.setAgility(0);
                player.setIntelligence(0);
                initializePlayers(player);
            }
        }
        return player;
    }


    /**
     * Players attack
     *
     * @param player a generalistic player
     */

    private void playersAttacks(Character player) {
        System.out.println("Joueur " + player.getNumberOfPlayers() + " Choisit ton attaque : \n" +
                "1 - Attaque Basique \n2- Attaque Spéciale");
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
                        System.out.println("Joueur " + player.getNumberOfPlayers() + " Utilise " + player.getAttackName());
                        bool = true;
                        break;
                    default:
                        System.out.println("Hey! Mais cette attaque n'est pas autorisée (pas de coups bas, attention je t'ai à l'oeil...)\n Merci de saisir 1 ou 2 ;)");
                        bool = false;
                }
            } while (!bool);
        } catch (InputMismatchException e) {
            System.out.println("Nop merci de saisir 1 ou 2...");
        }
    }

    /**
     * Gestion of attacks
     *
     * @param player1 first player
     * @param player2 second player
     */
    private void attacksgestion(Character player1, Character player2) {
        if (player1.getLife() > 0 && player2.getLife() > 0) {
            System.out.println("\nround n° " + i);

            //PLAYER 1
            while (nbOfAttack != 1 && nbOfAttack != 2) {
                System.out.println("\nLa vie du joueur 1 est de " + player1.getLife());
                playersAttacks(player1);
                if (nbOfAttack == 1) {
                    player2.setLife(player2.getLife() - player1.getDamages());
                    System.out.println("et fait " + player1.getDamages()
                            + " de dégats.");
                } else {
                    if (nbOfAttack == 0) {
                        System.out.println("à nouveau : ");
                    } else if (player1.getNumberOfClass() == 1) {
                        player2.setLife(player2.getLife() - player1.getDamages());
                        System.out.println("fait " + player1.getDamages()
                                + " de dégats " + player1.getAttackEffects());
                    } else {
                        System.out.println(player1.getAttackEffects());
                    }
                }
            }
            //PLAYER 2
            nbOfAttack = 0;

            if (player2.getLife() > 0) {
                while (nbOfAttack != 1 && nbOfAttack != 2) {
                    System.out.println("\nLa vie du joueur 2 est de " + player2.getLife());
                    playersAttacks(player2);
                    if (nbOfAttack == 1) {
                        player1.setLife(player1.getLife() - player2.getDamages());
                        System.out.println("fait " + player2.getDamages() + " de dégats ");
                    } else {
                        if (nbOfAttack == 0) {
                            System.out.println("à nouveau : ");
                        } else if (player2.getNumberOfClass() == 1) {
                            player1.setLife(player1.getLife() - player2.getDamages());
                            System.out.println("fait " + player2.getDamages() + " de dégats "
                                    + player2.getAttackEffects());
                        } else {
                            System.out.println(player2.getAttackEffects());
                        }
                    }
                }

            }
            nbOfAttack = 0;
            i++;
        }
    }


    /**
     * Game ending
     */
    private void gameEnding() {
        System.out.println("Fin du jeu");
        if (player1.getLife() > 0) {
            System.out.println("Le joueur 1 est victorieux");
        } else {
            System.out.println("Le joueur 2 est victorieux");
        }
        System.out.println("\n" +
                "                o    /\\-*****-/\\    o\n" +
                "                 \\  (  (|)  (|) )  /\n" +
                "                  \\    === 0 ===  /\n");
    }

    /**
     * Run process for game
     */

    public void runGame() {
        Scanner scanner = new Scanner(System.in);
        int choosenClass;

        // INTRO
        displayIntroduction();
        //INITILISATION DE PERSO
        //Player 1
        try {
            do {
                displayAvailableClasses();
                choosenClass = scanner.nextInt();

                if (choosenClass == 1 || choosenClass == 2 || choosenClass == 3) {
                    player1 = initializePlayers(chooseClass(choosenClass));
                    player1.setNumberOfPlayers(1);
                    System.out.println(player1);
                }
            } while (choosenClass != 1 && choosenClass != 2 && choosenClass != 3);

            //Player 2
          do {
                displayAvailableClasses();
                choosenClass = scanner.nextInt();
                if (choosenClass == 1 || choosenClass == 2 || choosenClass == 3) {
                    player2 = initializePlayers(chooseClass(choosenClass));
                    player2.setNumberOfPlayers(2);
                    System.out.println(player2);
                }
            } while (choosenClass != 1 && choosenClass != 2 && choosenClass != 3);

        } catch (NullPointerException e) {
            System.out.println("Merci de rentrer 1 2 ou 3 : ");
            runGame();
        } catch (InputMismatchException e) {
            System.out.println("Merci de rentrer 1 2 ou 3 : ");
            runGame();
        }


        //BOUCLE DE COMBAT
        do {
            attacksgestion(player1, player2);

        } while (player1.getLife() > 0 && player2.getLife() > 0);
        // FIN DU JEU
        gameEnding();
        scanner.close();
    }

}
