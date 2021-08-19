package oop.example.Ex42;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ProcessDataTest {

    @Test
    void splitData() {
    }

    @Test
    void sortIntoTable() {
    }

    @Test
    void findLongestValues() {
    }

    @Test
    void addInSpaces() {
        ProcessData process = new ProcessData();

        String expected = "The password '123' is a very weak password.";

        ArrayList<String> values = new ArrayList<>();
        values.add("Keri");
        values.add("Lora");
        values.add("Marissa");
        values.add("John");
        String actual = process.addInSpaces(3, values, 7);

        assertEquals(expected, actual);
    }
}