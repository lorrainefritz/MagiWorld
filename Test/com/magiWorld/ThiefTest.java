package com.magiWorld;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThiefTest {


    public void ThiefSentence() { // renommé pour plus de clarté
        Thief thief = new Thief(1, 1, 0, 0);
        assertEquals("(whispering) je suis le roublard : moins fort, penses à ma discretion bon sang!" +
                        " je possède 0 de vitalité, 1 de force, 0 d'agilité et 0 d'intelligence +  \n",
                thief.toString());
    }



    @Test
    void basicAttack() {
    }

    @Test
    void specialAttack() {
    }
}