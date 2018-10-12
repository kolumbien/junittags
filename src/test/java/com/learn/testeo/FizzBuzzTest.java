package com.learn.testeo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


public class FizzBuzzTest {


    @Tag("Adri")
    @Test
    @DisplayName("╯°□°）╯")
    void testWithDisplayNameContainingSpecialCharacters() {
        System.out.println("FizzBuzzTest.testWithDisplayNameContainingSpecialCharacters");
    }


    @Test
    @DisplayName("😱")
    void testWithDisplayNameContainingEmoji() {
        System.out.println("FizzBuzzTest.testWithDisplayNameContainingEmoji");
    }
}

