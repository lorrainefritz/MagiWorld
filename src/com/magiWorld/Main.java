package com.magiWorld;

import java.util.stream.Collector;

public class Main {
    public static void main(String[] args) {


        try {  Character wizard= new Wizard(3, 0, 0, 4);
         wizard.characteristicsChecker();

        }catch (CharacterException e){
         System.out.println("le nombre de points à attribuer au caractéristiques de ton perso doit être égal à ton niveau ^^."); //\n " +
                 //"Ton niveau est de " + wizard.getLevel()+" tu as donc " +wizard.getLevel() +" à attribuer");
        }

    }
}
