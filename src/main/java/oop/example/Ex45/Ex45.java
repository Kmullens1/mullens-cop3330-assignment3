/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Keri Mullens
 */
package oop.example.Ex45;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ex45 {

    private static final Scanner input = new Scanner(System.in);

    public static void readInput()
    {
        //Ask for the file that needs to be read
        System.out.print("Input the exact address location of the file you want to edit: ");
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

        //Call changeToUse function from Editor class
        Editor edit = new Editor();
        edit.changeToUse(fileContents);

        //Ask for the name of the output file
        System.out.print("Where do you want to save the edited file. Input the exact file location: ");
        //Read user input
        String outputFileName = input.nextLine();

        //Call newFile function from CreateNewFile class
        CreateNewFile create = new CreateNewFile();
        create.newFile(outputFileName);
    }

    public static void main(String[] args) {

        //Word Finder
        /*There will be times when you'll need to read in one file, modify it,
        and then write a modified version of that file to a new file.
        Given an input file, read the file and look for all occurrences of
        the word utilize
            Replace each occurrence with: use
            Write the modified file to a new file.
        Example Output
            - Given the input file of
                One should never utilize the word "utilize" in writing. Use "use" instead.
            - The program should generate
                One should never use the word "use" in writing. Use "use" instead.
        Constraints
            Prompt for the name of the output file.
            Write the output to a new file.*/

      readInput();


    }
}
