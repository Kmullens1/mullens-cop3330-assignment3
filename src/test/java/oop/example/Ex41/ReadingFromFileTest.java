package oop.example.Ex41;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReadingFromFileTest {

    @Test
    void accessFile_Check_That_File_Is_Read_Correctly() {

        ReadingFromFile read = new ReadingFromFile();

        String[] expectedInput = {"Ling, Mai", "Johnson, Jim", "Zarnecki, Sabrina",
                "Jones, Chris", "Jones, Aaron", "Swift, Geoffrey", "Xiong, Fong"};
        String expected = expectedInput[0] + expectedInput[1] + expectedInput[2] +
                expectedInput[3] + expectedInput[4] + expectedInput[5] + expectedInput[6];

        String[] actualInput = read.accessFile();
        String actual = actualInput[0] + actualInput[1] + actualInput[2] +
                actualInput[3] + actualInput[4] + actualInput[5] + actualInput[6];

        assertEquals(expected, actual);

    }
}