package oop.example.Ex46;

import java.util.ArrayList;

public class AnalyzeFile {

    String wordCounter(String fileContents) {

        //Split fileContents into an array of strings
        String[] arrayOfContents = fileContents.split(" ");
                //Contains: badger badger badger badger mushroom mushroom snake badger badger badger

        //Create an ArrayList of each unique word
        ArrayList<String> OccurringWords = new ArrayList<String>();
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
        ArrayList<String> count = new ArrayList<String>();


        //Count the times that each word in the OccurringWords list appears in the fileContents
        for(int i = 0; i < OccurringWords.size(); i++)
        {
            //row.add(OccurringWords.get(i));
            for(int j = 0; j < arrayOfContents.length; j++)
            {
                if(OccurringWords.get(i).equals(arrayOfContents[j]))
                    wordCount++;
            }
            count.add(String.valueOf(wordCount));
            System.out.println(OccurringWords.get(i) + ": " + wordCount);
        }

        //Create a list of lists with each string and its respective count
        //Return object

        //FIXME: Ultimately should not return null
        return null;
    }
}
