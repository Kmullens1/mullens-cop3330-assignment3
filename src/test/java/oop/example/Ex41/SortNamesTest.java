package oop.example.Ex41;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortNamesTest {

    @Test
    void sortNamesFunction_Check_Sorting_Ability_With_Expected_Names_From_File() {
       SortNames sort = new SortNames();

        String expected = """
                Johnson, Jim
                Jones, Aaron
                Jones, Chris
                Ling, Mai
                Swift, Geoffrey
                Xiong, Fong
                Zarnecki, Sabrina
                """;

        String[] input = {"Ling, Mai", "Johnson, Jim", "Zarnecki, Sabrina",
                "Jones, Chris", "Jones, Aaron", "Swift, Geoffrey", "Xiong, Fong"};
        String actual = sort.sortNamesFunction(input);

        assertEquals(expected, actual);
    }

    @Test
    void sortNamesFunction_Check_Sorting_Ability_With_Another_Name_List() {
        SortNames sort = new SortNames();

        String expected = """
                Butts, Charles
                Ferguson
                Hassan, Michelle
                Mullens, Keri
                Nugent, B
                Nugent, Katrina
                Nugent, Marissa
                """;

        String[] input = {"Nugent, Marissa", "Nugent, Katrina", "Mullens, Keri",
                "Nugent, B", "Ferguson", "Butts, Charles", "Hassan, Michelle"};
        String actual = sort.sortNamesFunction(input);

        assertEquals(expected, actual);
    }
}