package com.magiWorld;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThiefTest {

    // tests renommés pour plus de clarté

    @Test
    public void thiefSentence() {
        Thief thief = new Thief(1, 1, 0, 0);
        assertEquals("(whispering) je suis le roublard : moins fort, penses à ma discretion bon sang!" +
                        " je possède 0 de vitalité, 1 de force, 0 d'agilité et 0 d'intelligence +  \n",
                thief.toString());
    }
    @Test
    public void getLevel () {
        Character thief = new Thief(1, 1, 0,0);
        assertEquals(1, thief.getLevel(), 0.01);
    }



    @Test
    void basicAttack() {
    }

    @Test
    void specialAttack() {
    }
}