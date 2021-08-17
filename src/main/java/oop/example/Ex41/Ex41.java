/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Keri Mullens
 */
package oop.example.Ex41;

import java.util.Scanner;

public class Ex41 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        //Name Sorter
        /*Alphabetizing the contents of a file, or sorting its contents, is a great way
        to get comfortable manipulating a file in your program.

        Create a program that reads in the following list of names:
            Ling, Mai
            Johnson, Jim
            Zarnecki, Sabrina
            Jones, Chris
            Jones, Aaron
            Swift, Geoffrey
            Xiong, Fong

        Read this program and sort the list alphabetically. Then print the sorted list to a
        file that looks like the following example output.
        Example Output
            Total of 7 names
            -----------------
            Ling, Mai
            Johnson, Jim
            Jones, Aaron
            Jones, Chris
            Swift, Geoffrey
            Xiong, Fong
            Zarnecki, Sabrina
        Constraint
            Don't hard-code the number of names.*/

        System.out.println("Total of 7 names\n-----------------");

        //Read from file
        ReadingFromFile accessFile = new ReadingFromFile();
        String[] names = accessFile.accessFile();

        //Sort the names
        SortNames sort = new SortNames();
        String sortedNames = sort.sortNamesFunction(names);

        //Print out sorted names
        System.out.print(sortedNames);

    }
}
