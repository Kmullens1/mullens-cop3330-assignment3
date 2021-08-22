package oop.example.Ex43;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class CreateHTMLFileTest {

    @Test
    void htmlFile_Test_That_The_File_Is_Created_Properly() {
        CreateHTMLFile create = new CreateHTMLFile();
        create.htmlFile("HelloWorld", "Keri");

        boolean bool = false;
        File createHTML = new File("C:\\Users\\kmull\\Desktop\\HelloWorld.html");
        if(createHTML.exists() && !createHTML.isDirectory()) {
            bool = true;
        }

        assertTrue(bool);
    }
}