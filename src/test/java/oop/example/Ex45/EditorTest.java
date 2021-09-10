package oop.example.Ex45;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EditorTest {

    @Test
    void changeToUse_Example_Sentence() {
        Editor test = new Editor();

        String expected = "One should never use the word \"use\" in writing. Use \"use\" instead.";

        String actual = test.changeToUse("One should never utilize the word \"utilize\" in writing. Use \"use\" instead.");

        assertEquals(expected, actual);
    }

    @Test
    void changeToUse_Alternate_Case_Version_of_Example_Sentence() {
        Editor test = new Editor();

        String expected = "One should never Use the word \"Use\" in writing. use \"Use\" instead.";

        String actual = test.changeToUse("One should never Utilize the word \"Utilize\" in writing. use \"Use\" instead.");

        assertEquals(expected, actual);
    }

    @Test
    void changeToUse_Empty_File() {
        Editor test = new Editor();

        String expected = "";

        String actual = test.changeToUse("");

        assertEquals(expected, actual);
    }
}