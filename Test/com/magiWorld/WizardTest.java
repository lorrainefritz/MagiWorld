package com.magiWorld;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WizardTest {
// tests renommés pour plus de clarté

    @Test
    public void wizardSentence() {
        Wizard wizard = new Wizard (1, 1, 0, 0);
        assertEquals("Abracadabra je suis le sorcier : bon sérieusement qu'est ce qu'on brûle aujourd'hui?"+
                        " je possède 0 de vitalité, 1 de force, 0 d'agilité et 0 d'intelligence +  \n",
                wizard.toString());
    }

    @Test
    public void getLevel () {
        Character wizard = new Wizard(1, 1, 0,0);
        assertEquals(1, wizard.getLevel(), 0.01);
    }



    @Test
    void basicAttack() {
    }

    @Test
    void specialAttack() {
    }
}