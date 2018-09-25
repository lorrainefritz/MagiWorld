package com.magiWorld;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;

class GameManagerTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void Given_Warrior_When_chooseClass_Then_DisplayWarriorSentence() {
        GameManager gameManager = new GameManager(); // ne me plait PAS DUTOUT de créer une instance de GameManager car c'est bizarre
        gameManager.chooseClass(1);
        assertEquals("Vous avez choisi le Guerrier", outContent.toString().replace("\r\n", "\n"));
    }

    @Test
    public void Given_Thief_When_chooseClass_Then_DisplayThiefSentence() {
        GameManager gameManager = new GameManager();
        gameManager.chooseClass(2);
        assertEquals("Vous avez choisi le Roublard", outContent.toString().replace("\r\n", "\n"));
    }

    @Test
    public void Given_Wizard_When_chooseClass_Then_DisplayWizardSentence() {
        GameManager gameManager = new GameManager();
        gameManager.chooseClass(3);
        assertEquals("Vous avez choisi le Sorcier", outContent.toString().replace("\r\n", "\n"));
    }
}