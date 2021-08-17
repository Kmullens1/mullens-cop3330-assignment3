/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Keri Mullens
 */
package oop.example.Ex41;

import java.util.Arrays;

public class SortNames {

    public String sortNamesFunction(String[] names)
    {
        Arrays.sort(names);
        StringBuilder sortedNames = new StringBuilder();

        for (String name : names) {
            sortedNames.append(name).append("\n");
        }

        return sortedNames.toString();
    }
}


