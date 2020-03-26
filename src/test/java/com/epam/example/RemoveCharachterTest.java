package com.epam.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveCharachterTest {

    /* TODO list for my feature
     *1. 2 chars with A in first position: AB => B ---SUCCESS
     *2. 2 chars with A in second position: BA => B --- SUCCESS
     *3. 2 chars without A: BC => BC --- SUCCESS
     *4. 2 chars with A in first and second position: AA => " " ---SUCCESS
     *5. n chars with A in position first or second position: ABCD => BCD ---SUCCESS
     *6. n chars with A in any positon other than first and second: BCVHFAAAIJHK => BCVHFAAAIJHK ---SUCCESS
     *7. 1 char with A : A => " " ---SUCCESS
     *8. 1 char without A: B => B ---SUCCESS
     *6. Empty String: " " => " " ---SUCCESS
     */
    RemoveCharachter rc;

    @BeforeEach
    void setup(){
        rc = new RemoveCharachter();
    }
    @Test
    void removefromNChars() {
        assertEquals("BCD", rc.remove("ABCD"));
        assertEquals("CD", rc.remove("AACD"));
        assertEquals("BCD", rc.remove("BACD"));
        assertEquals("BBAA", rc.remove("BBAA"));
        assertEquals("BAA", rc.remove("AABAA"));

    }
    @Test
    void removeFromNullString(){
        assertEquals("", rc.remove(""));
    }

    @Test
    void removeFrom1Char(){
        assertEquals("", rc.remove("A"));
        assertEquals("B", rc.remove("B"));
    }
    @Test
    void removeFrom2Chars(){
        assertEquals("B", rc.remove("AB"));
        assertEquals("", rc.remove("AA"));
        assertEquals("BC",rc.remove("BC"));

    }

}