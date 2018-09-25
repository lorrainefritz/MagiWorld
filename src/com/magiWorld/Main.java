package com.magiWorld;

public class Main {
    public static void main(String[] args) {
       Character warrior1 = new Warrior(1, 1, 0, 0) {
       };
       Character warrior2 = new Warrior(2, 1, 0, 0) {
        };
        Character thief= new Thief(6, 0, 1, 0);
        Character wizard= new Wizard(50, 0, 0, 1);

        System.out.println(warrior2.toString());
        System.out.println(thief.toString());
        System.out.println(wizard.toString());
        System.out.println("Hey! Mais en fait cette classe de perso n'a pas encore été programmée!\n" +
                "Merci de choisir (pour le moment) entre 1 2 ou 3 svp ;)");
    }
}
