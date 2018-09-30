package com.magiWorld;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WizardTest {

    @Test
    public void WizardSentence() { // renommé pour plus de clarté
        Wizard wizz = new Wizard (1, 1, 0, 0);
        assertEquals("Abracadabra je suis le sorcier : bon sérieusement qu'est ce qu'on brûle aujourd'hui?"+
                        " je possède 0 de vitalité, 1 de force, 0 d'agilité et 0 d'intelligence +  \n",
                wizz.toString());
    }



    @Test
    void basicAttack() {
    }

    @Test
    void specialAttack() {
    }
}