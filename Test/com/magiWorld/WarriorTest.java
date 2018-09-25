package com.magiWorld;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();


    @Test
    public void Given_WarriorDescprition_When_chooseClass_Then_DisplayWarriorSentence() {
       Warrior warrior1 = new Warrior(1, 1, 0, 0);
       System.out.println(warrior1.toString());
        assertEquals("Woarg je suis le guerrier Joueur 1 de niveau 1 je possède 5 en vitalité, 1 en force, 0 en d'agilité et 0 d'intelligence." + " \n",
                outContent.toString().replace("\r\n", "\n"));
    }

    @Test
    void basicAttack() {
    }

    @Test
    void specialAttack() {
    }


}