package oop.example.Ex42;

import java.util.ArrayList;
import java.util.List;

public class ProcessData {

    //Split the data into the correct columns and rows
    public List<String>[] splitData(ArrayList<String> names)
    {
        //Create new array lists to help sort the values into the correct columns
        ArrayList<String> lastNames = new ArrayList<>();
        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> salaries = new ArrayList<>();

        //Check each row for commas
        for(int i = 0; i < names.size(); i++)
        {
            String currentString = names.get(i);
            String currentLastName = "";
            String currentFirstName = "";
            String currentSalary = "";

            //Save the characters into the lastNames ArrayList until a comma is found in the current string
            int j = 0;
            while(currentString.charAt(j) != ',') {
                currentLastName = currentLastName + currentString.charAt(j);
                j++;
            }

            //Save the characters into the firstNames ArrayList until a comma is found in the current string
            j++;
            while(currentString.charAt(j) != ',') {
                currentFirstName = currentFirstName + currentString.charAt(j);
                j++;
            }

            //Save the characters into the salary ArrayList until the end of the current string is reached
            j++;
            while(j < currentString.length()) {
                currentSalary = currentSalary + currentString.charAt(j);
                j++;
            }

            //Add the current lastNames, firstNames and salaries into the correct ArrayList
            lastNames.add(currentLastName);
            firstNames.add(currentFirstName);
            salaries.add(currentSalary);
        }

        //Save everything to a list of Arrays, so they can all be returned from the function
        List<String>[] listOfArrays = new List[3];
        listOfArrays[0] = lastNames;
        listOfArrays[1] = firstNames;
        listOfArrays[2] = salaries;

        return listOfArrays;
    }



    //search for the longest value
    public int findLongestValues(List<String> values) {
        //cycle through each value, if it's longer than the previous one, it becomes the new longestValue
        int longestValue = 0;
        for (int j = 0; j < values.size(); j++) {
            if (longestValue < values.get(j).length()) {
                longestValue = values.get(j).length();
            }
        }

        return longestValue;
    }

    //Add in the spaces between columns
    public String addInSpaces(int i, List<String> values, int longestLength) {
        //if the length of the value is less than the longest length + 1, then add a space to the value
        while(values.get(i).length() < longestLength + 1)
        {
            values.set(i, values.get(i) + " ");
        }
        return values.get(i);
    }

}
