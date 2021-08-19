package oop.example.Ex42;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ProcessDataTest {

    ////Split Data Tests////////////////////////////////////////////////////////////////
    @Test
    void splitData() {
    }

    ////Sort Into Table Tests///////////////////////////////////////////////////////////
    @Test
    void sortIntoTable() {
    }

    ////Find Longest Values Tests///////////////////////////////////////////////////////
    @Test
    void findLongestValues_In_Normal_Circumstances() {
        ProcessData process = new ProcessData();

        int expected = 7;

        ArrayList<String> values = new ArrayList<>();
        values.add("Karen");
        values.add("Lora");
        values.add("Marissa");
        values.add("John");

        int actual = process.findLongestValues(values);

        assertEquals(expected, actual);
    }

    @Test
    void findLongestValues_When_All_Lengths_Are_The_Same() {
        ProcessData process = new ProcessData();

        int expected = 4;

        ArrayList<String> values = new ArrayList<>();
        values.add("Keri");
        values.add("Lora");
        values.add("Nola");
        values.add("John");

        int actual = process.findLongestValues(values);

        assertEquals(expected, actual);
    }


    ////Add In Spaces Tests/////////////////////////////////////////////////////////////
    @Test
    void addInSpaces_Are_The_Correct_Number_Of_Spaces_Added_For_Shorter_Item() {
        ProcessData process = new ProcessData();

        String expected = "John    ";

        ArrayList<String> values = new ArrayList<>();
        values.add("Keri");
        values.add("Lora");
        values.add("Marissa");
        values.add("John");

        String actual = process.addInSpaces(3, values, 7);

        assertEquals(expected, actual);
    }

    @Test
    void addInSpaces_Are_The_Correct_Number_Of_Spaces_Added_For_Longest_Item() {
        ProcessData process = new ProcessData();

        String expected = "Marissa ";

        ArrayList<String> values = new ArrayList<>();
        values.add("Keri");
        values.add("Lora");
        values.add("Marissa");
        values.add("John");

        String actual = process.addInSpaces(2, values, 7);

        assertEquals(expected, actual);
    }
}