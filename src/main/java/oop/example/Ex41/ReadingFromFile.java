/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Keri Mullens
 */
package oop.example.Ex41;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFile {
    public String[] accessFile()
    {
        String[] names = new String[7];

        //Access file
        try {
            BufferedReader read =
                    new BufferedReader (new FileReader("C:\\Users\\kmull\\Desktop\\Keri's OOP Class\\IntelliJProjects\\mullens-cop3330-assignment3\\src\\main\\java\\oop\\example\\Ex41\\Names List"));

        //copy each line from the file to an array
            for(int i = 0; i < 7; i++)
            {
                try {
                    names[i] = read.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    //return the array to the main class
    return names;
    }

}
