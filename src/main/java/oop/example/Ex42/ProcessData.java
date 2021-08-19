package oop.example.Ex42;

import java.util.ArrayList;

public class ProcessData {

    //Split the data into the correct columns and rows
    public void splitData(ArrayList<String> names)
    {
        //Sort items into it's category
        ArrayList<String> lastNames = new ArrayList<>();
        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> salary = new ArrayList<>();

        //Check each row for commas
        for(int i = 0; i < names.size(); i++)
        {
            String currentString = names.get(i);
            String currentLastName = "";
            String currentFirstName = "";
            String currentSalary = "";

            //Save the characters into the lastNames ArrayList until a comma is found in the current string
            int j = 0;
            while(currentString.charAt(j) != ',')
            {
                currentLastName = currentLastName + currentString.charAt(j);
                j++;
            }

            //Save the characters into the firstNames ArrayList until a comma is found in the current string
            j++;
            while(currentString.charAt(j) != ',')
            {
                currentFirstName = currentFirstName + currentString.charAt(j);
                j++;
            }

            //Save the characters into the salary ArrayList until the end of the current string is reached
            j++;
            while(j < currentString.length())
            {
                currentSalary = currentSalary + currentString.charAt(j);
                j++;
            }

            //Add the current lastNames, firstNames and salaries into the correct ArrayList
            lastNames.add(currentLastName);
            firstNames.add(currentFirstName);
            salary.add(currentSalary);
        }

        //Call the sortIntoTable function
        sortIntoTable(lastNames, firstNames, salary);
    }

    //Sort everything into proper table format and print it out
    public void sortIntoTable(ArrayList<String> lastNames, ArrayList<String> firstNames, ArrayList<String> salary)
    {
        System.out.print("""
                Last     First    Salary
                --------------------------
                """);
        //Discover the longest value for each column to know how many spaces to add after each entry
        int longestLastName = findLongestValues(lastNames);
        int longestFirstName = findLongestValues(firstNames);
        int longestSalary = findLongestValues(salary);

        //Cycle through the lastName, firstName, and salary ArrayLists, printing them in order
        for(int i = 0; i < lastNames.size(); i++)
        {
            //Update each ArrayList so that each value has the proper number of spaces after it
            //FIXME - update to print string here instead of in addInSpaces
            lastNames.set(i, addInSpaces(i, lastNames, longestLastName));
            firstNames.set(i, addInSpaces(i, firstNames, longestFirstName));
            salary.set(i, addInSpaces(i, salary, longestSalary));
            System.out.println(lastNames.get(i) + firstNames.get(i) + salary.get(i));
        }

    }

    //search for the longest value
    public int findLongestValues(ArrayList<String> values) {
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
    public String addInSpaces(int i, ArrayList<String> values, int longestLength) {
        //if the length of the value is less than the longest length + 1, then add a space to the value
        while(values.get(i).length() < longestLength + 1)
        {
            values.set(i, values.get(i) + " ");
        }
        return values.get(i);
    }

}
