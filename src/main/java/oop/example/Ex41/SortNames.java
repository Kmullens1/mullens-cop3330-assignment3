/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Keri Mullens
 */
package oop.example.Ex41;

import java.util.Arrays;

public class SortNames {

    public String sortNamesFunction(String[] names)
    {
        //sort the array
        Arrays.sort(names);

        //set up array to print properly
        StringBuilder sortedNames = new StringBuilder();
        for (String name : names) {
            sortedNames.append(name).append("\n");
        }

        //return printable string of the list
        return sortedNames.toString();
    }
}


