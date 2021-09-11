package oop.example.Ex46;

import java.util.ArrayList;

public class AnalyzeFile {

    String wordCounter(String fileContents) {

        //Split fileContents into an array of strings
        String[] arrayOfContents = fileContents.split(" ");
                //Contains: badger badger badger badger mushroom mushroom snake badger badger badger

        //Create an ArrayList of each unique word
        ArrayList<String> OccurringWords = new ArrayList();
        OccurringWords.add(arrayOfContents[0]);
        for(int i = 0; i < arrayOfContents.length; i++)
        {
            for(int j = 0; j < OccurringWords.size(); j++)
            {
                if(!arrayOfContents[i].equals(OccurringWords.get(j)))
                    OccurringWords.add(arrayOfContents[i]);
            }
        }


        int wordCount = 0;
        ArrayList<String> row = new ArrayList();


        //Compare each string and count the occurrences of each
        for(int i = 0; i < OccurringWords.length; i++)
        {
            row.add(OccurringWords[i]);
            for(int j = 0; j < OccurringWords.length; j++)
            {
                if(OccurringWords[i].equals(OccurringWords[j]))
                    wordCount++;

            }
        }

        //Create a list of lists with each string and its respective count
        //Return object

        return null;
    }
}
