package oop.example.Ex42;

import java.util.ArrayList;

public class ProcessData {

    //Split each line at the commas
    //Save each line into an array
    public void splitData(ArrayList<String> names)
    {
        ArrayList<String> lastNames = new ArrayList<>();
        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> salary = new ArrayList<>();

        for(int i = 0; i < names.size(); i++)
        {
            String currentString = names.get(i);
            String currentLastName = "";
            String currentFirstName = "";
            String currentSalary = "";

            int j = 0;
            while(currentString.charAt(j) != ',')
            {
                currentLastName = currentLastName + currentString.charAt(j);
                j++;
            }

            j++;
            while(currentString.charAt(j) != ',')
            {
                currentFirstName = currentFirstName + currentString.charAt(j);
                j++;
            }

            j++;
            while(j < currentString.length())
            {
                currentSalary = currentSalary + currentString.charAt(j);
                j++;
            }
            lastNames.add(currentLastName);
            firstNames.add(currentFirstName);
            salary.add(currentSalary);
        }

        sortIntoTable(lastNames, firstNames, salary);
    }

    //Sort everything into table format
    public void sortIntoTable(ArrayList<String> lastNames, ArrayList<String> firstNames, ArrayList<String> salary)
    {
        System.out.print("Last     First    Salary\n" +
                "--------------------------\n");

        int longestLastName = findLongestValues(lastNames);
        int longestFirstName = findLongestValues(firstNames);
        int longestSalary = findLongestValues(salary);

        for(int i = 0; i < lastNames.size(); i++)
        {
            addInSpaces(i, lastNames, longestLastName);
            addInSpaces(i, firstNames, longestFirstName);
            addInSpaces(i, salary, longestSalary);
            System.out.println();
        }

    }

    public int findLongestValues(ArrayList<String> values) {
        int longestValue = 0;
        for (int j = 0; j < values.size(); j++) {
            if (longestValue < values.get(j).length()) {
                longestValue = values.get(j).length();
            }
        }

        return longestValue;
    }

    public void addInSpaces(int i, ArrayList<String> lastNames, int longestLength) {
        while(lastNames.get(i).length() < longestLength + 1)
        {
            lastNames.set(i, lastNames.get(i) + " ");
        }
        System.out.print(lastNames.get(i));
    }

}
