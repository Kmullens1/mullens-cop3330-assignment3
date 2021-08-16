/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Keri Mullens
 */
package oop.example.Ex41;

import java.util.Arrays;

public class SortNames {

    public void sortNamesFunction(String[] names)
    {
        Arrays.sort(names);

        for(int i = 0; i < names.length; i++)
        {
            System.out.println(names[i]);
        }
    }
}


