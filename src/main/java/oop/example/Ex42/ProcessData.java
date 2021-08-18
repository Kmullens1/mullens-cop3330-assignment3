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

    }

     //return array

}
