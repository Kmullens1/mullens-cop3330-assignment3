/*
* UCF COP3330 Summer 2021 Assignment 3 Solution
* Copyright 2021 Keri Mullens
*/
package oop.example.Ex46;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ex46 {
    private static final Scanner input = new Scanner(System.in);

    public static void readInput() {
        //Ask for the file that needs to be read
        System.out.print("What is the exact address location of the file you want to analyze: ");
        String fileLocation = input.nextLine();

        //Read the file
        BufferedReader read = null;
        try {
            read = new BufferedReader(new FileReader(fileLocation));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //Save file contents as a string
        String fileContents = null;
        try {
            assert read != null;
            fileContents = read.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Call wordCounter function from AnalyzeFile class
        AnalyzeFile analyze = new AnalyzeFile();
        analyze.wordCounter(fileContents);

    }

    public static void main(String[] args) {
        //Word Frequency Finder
        /*Knowing how often a word appears in a sentence or block of text is helpful for
        creating word clouds and other types of word analysis. And it’s more useful when
        running it against lots of text.
        Create a program that reads in a file and counts the frequency of words in the file.
        Then construct a histogram displaying the words and the frequency, and display the
        histogram to the screen.
        Example Output
            - Given the text file words.txt with this content
                badger badger badger badger mushroom mushroom snake badger badger badger
            - the program would produce the following output:
                badger: *******
                mushroom: **
                snake: *
        Constraint
            Ensure that the most used word is at the top of the report and the least used words
            are at the bottom.*/

        readInput();
    }
}
