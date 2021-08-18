/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Keri Mullens
 */
package oop.example.Ex42;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Ex42 {

    public static ArrayList<String> readFile()
    {
        ArrayList<String> names = new ArrayList<>();
        //Read in the data
        BufferedReader read = null;
        try {
            read = new BufferedReader(new FileReader("C:\\Users\\kmull\\Desktop\\Keri's OOP Class\\IntelliJProjects\\mullens-cop3330-assignment3\\src\\main\\java\\oop\\example\\Ex42\\Records"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for(int i = 0; i < 7; i++) {
            try {
                assert read != null;
                String newName = read.readLine();
                names.add(newName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return names;
    }


    public static void main(String[] args) {
        //Parsing a Data File
        /*Sometimes data comes in as a structured format that you have to break
        down and turn into records so that  you can process them. CSV, or comma-separated
        values, is a common standard for doing this.
        Construct a program that reads in the following data file:
            Ling,Mai,55900
            Johnson,Jim,56500
            Jones,Aaron,46000
            Jones,Chris,34500
            Swift,Geoffrey,14200
            Xiong,Fong,65000
            Zarnecki,Sabrina,51500
        Process the records and display the results formatted as a table, evenly spaced, as
        shown in the example output.
        Example Output
            Last     First    Salary
            --------------------------
            Ling Mai 55900
            Johnson  Jim      56500
            Jones    Aaron    46000
            Jones    Chris    34500
            Swift    Geoffrey 14200
            Xiong    Fong     65000
            Zarnecki Sabrina  51500
        Constraints
            Write your own code to parse the data. Don't use a CSV parser.
            Use spaces to align the columns.
            Make each column one space longer than the longest value in the column.*/


        //Read in the data
        ArrayList<String> names = readFile();

        //Call processData class
        ProcessData process = new ProcessData();

        //Process the data
        process.splitData(names);

    }
}

