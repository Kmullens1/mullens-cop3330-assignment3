package oop.example.Ex46;

import java.util.ArrayList;

public class AnalyzeFile {

    public ArrayList<String> wordList(String fileContents) {

        //Split fileContents into an array of strings
        String[] arrayOfContents = fileContents.split(" ");
                //Contains: badger badger badger badger mushroom mushroom snake badger badger badger

        //Create an ArrayList of each unique word
        ArrayList<String> occurringWords = new ArrayList<String>();

        occurringWords.add(arrayOfContents[0]);

        for(int i = 0; i < arrayOfContents.length; i++)
        {
            boolean matchIndicator = false;
            for(int j = 0; j < occurringWords.size(); j++)
            {
                if(arrayOfContents[i].equals(occurringWords.get(j)))
                    matchIndicator = true;
            }
            if(!matchIndicator)
                occurringWords.add(arrayOfContents[i]);
        }

        ArrayList<Integer> wordCount = wordCounter(arrayOfContents, occurringWords);
        output(occurringWords, wordCount);

        return occurringWords;
    }

    public ArrayList<Integer> wordCounter(String[] arrayOfContents, ArrayList<String> occurringWords)
    {
        ArrayList<Integer> wordCount = new ArrayList<Integer>();

        //Count the times that each word in the occurringWords list appears in the fileContents
        for(int i = 0; i < occurringWords.size(); i++)
        {
            int count = 0;

            for(int j = 0; j < arrayOfContents.length; j++)
            {
                if(occurringWords.get(i).equals(arrayOfContents[j]))
                    count++;
            }
            wordCount.add(count);
        }

        //Create a list of lists with each string and its respective wordCount
        //Return object

        return wordCount;
    }

    private void output(ArrayList<String> occurringWords, ArrayList<Integer> wordCount)
    {
        for(int i = 0; i < occurringWords.size(); i++)
        {
            System.out.print(occurringWords.get(i) + ": ");

            for(int j = 0; j < wordCount.get(i); j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
