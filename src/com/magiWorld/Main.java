package com.magiWorld;

public class Main {
    public static void main(String[] args) {
       Character warrior1 = new Warrior(1, 1, 0, 0) {
       };
       Character warrior2 = new Warrior(2, 2, 0, 0) {
        };
        Character thief= new Thief(6, 0, 1, 0);
        Character wizard= new Wizard(50, 0, 0, 1);

        System.out.println(warrior2);
        System.out.println(thief);
        System.out.println(wizard);

        System.out.println ("Les dommages de l'attaque classique sont de "+((Warrior) warrior1).getDamages());
        System.out.println ("Les dommages de l'attaque classique sont de "+((Warrior) warrior2).getDamages());
        warrior1.specialAttack();
        System.out.println("Les dommages de l'attaque speciale sont de "+(((Warrior) warrior1).getDamages())+
                " et les malus sont de "+ ((Warrior) warrior1).getMalus()+". La vie du guerrier est maintenant de " + warrior1.getLife());

    }
}
