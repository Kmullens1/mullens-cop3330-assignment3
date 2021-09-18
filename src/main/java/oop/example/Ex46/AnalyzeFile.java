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
                if (arrayOfContents[i].equals(occurringWords.get(j))) {
                    matchIndicator = true;
                }
            }
            if(!matchIndicator)
                occurringWords.add(arrayOfContents[i]);
        }

        ArrayList<Integer> wordCount = wordCounter(arrayOfContents, occurringWords);


        ArrayList<Object> info = sortWordCount(wordCount, occurringWords);

        ArrayList<ArrayList<String>> occurringWords2 = new ArrayList<ArrayList<String>>();
        occurringWords2.add((ArrayList<String>) info.get(0));
        ArrayList<ArrayList<Integer>> wordCount2 = new ArrayList<ArrayList<Integer>>();
        wordCount2.add((ArrayList<Integer>) info.get(1));


        for(int i = 0; i < occurringWords.size(); i++)
        {
            occurringWords.set(i, occurringWords2.get(0).get(i));
        }

        for(int i = 0; i < wordCount.size(); i++)
        {
            wordCount.set(i, wordCount2.get(0).get(i));
        }


        output(occurringWords, wordCount);

        return occurringWords;
    }

    public ArrayList<Integer> wordCounter(String[] arrayOfContents, ArrayList<String> occurringWords)
    {
        ArrayList<Integer> wordCount = new ArrayList<>();

        //Count the times that each word in the occurringWords list appears in the fileContents
        for (String occurringWord : occurringWords) {

            int count = 0;

            for (String arrayOfContent : arrayOfContents) {
                if (occurringWord.equals(arrayOfContent))
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

    private ArrayList<Object> sortWordCount(ArrayList<Integer> wordCount, ArrayList<String> occurringWords) {

        for(int i = 0; i < wordCount.size() - 1; i++)
        {
            for(int j = i; j < wordCount.size() - 1; j++)
            {
                if (wordCount.get(i) < wordCount.get(j + 1))
                {
                    int temp = wordCount.get(i);
                    wordCount.set(i, wordCount.get(j + 1));
                    wordCount.set(j + 1, temp);

                    String tempString = occurringWords.get(i);
                    occurringWords.set(i, occurringWords.get(j + 1));
                    occurringWords.set(j + 1, tempString);
                }
            }
        }


        ArrayList<Object> info = new ArrayList<>();
        info.add(occurringWords);
        info.add(wordCount);

        return info;
    }
}
