package oop.example.Ex46;

import java.util.ArrayList;

public class AnalyzeFile {

    public ArrayList<String> wordList(String fileContents) {

        //Split fileContents into an array of strings
        String[] arrayOfContents = fileContents.split(" ");
                //Contains: badger badger badger badger mushroom mushroom snake badger badger badger

        //Create an ArrayList of each unique word
        ArrayList<String> occurringWords = new ArrayList<String>();

        //Add the 1st word from fileContents into the occurringWords ArrayList
        occurringWords.add(arrayOfContents[0]);

        //Cycle through all the words in fileContents to list every word that appears
        for(int i = 0; i < arrayOfContents.length; i++)
        {
            boolean matchIndicator = false;
            //Check if the current word is already in the occurringWords list
            for(int j = 0; j < occurringWords.size(); j++)
            {
                //If any of the words in the occurringWords list match the current word, change matchIndicator to true
                if (arrayOfContents[i].equals(occurringWords.get(j))) {
                    matchIndicator = true;
                }
            }
            //If no matches were found, add current word to the list
            if(!matchIndicator)
                occurringWords.add(arrayOfContents[i]);
        }

        //Call wordCounter function to count how many times each occurring word appears
        ArrayList<Integer> wordCount = wordCounter(arrayOfContents, occurringWords);

        //Call the sortWordCount function to sort the words in order of most to least common
        ArrayList<Object> info = sortWordCount(wordCount, occurringWords);

        //Convert wordCount and occurringWords lists into more accessible list type
        ArrayList<ArrayList<String>> occurringWords2 = new ArrayList<ArrayList<String>>();
        occurringWords2.add((ArrayList<String>) info.get(0));
        ArrayList<ArrayList<Integer>> wordCount2 = new ArrayList<ArrayList<Integer>>();
        wordCount2.add((ArrayList<Integer>) info.get(1));


        //save each occurringWord into a new list for accessibility
        for(int i = 0; i < occurringWords.size(); i++)
        {
            occurringWords.set(i, occurringWords2.get(0).get(i));
        }

        //save each wordCount into a new list for accessibility
        for(int i = 0; i < wordCount.size(); i++)
        {
            wordCount.set(i, wordCount2.get(0).get(i));
        }

        //Call output function to generate the proper output
        output(occurringWords, wordCount);

        //return occurringWords for function testing purposes
        return occurringWords;
    }

    public ArrayList<Integer> wordCounter(String[] arrayOfContents, ArrayList<String> occurringWords)
    {
        ArrayList<Integer> wordCount = new ArrayList<>();

        //Count the times that each word in the occurringWords list appears in the fileContents
        for (String occurringWord : occurringWords) {

            int count = 0;

            //increment count each time the current word matches a word in fileContents
            for (String arrayOfContent : arrayOfContents) {
                if (occurringWord.equals(arrayOfContent))
                    count++;
            }
            wordCount.add(count);
        }

        return wordCount;
    }

    private void output(ArrayList<String> occurringWords, ArrayList<Integer> wordCount)
    {
        //Cycle through occurringWords and wordCount lists to print each value in the correct location
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
        //check frequency of each word and sort the highest frequency words to the beginning of the list
        for(int i = 0; i < wordCount.size() - 1; i++)
        {
            for(int j = i; j < wordCount.size() - 1; j++)
            {
                if (wordCount.get(i) < wordCount.get(j + 1))
                {
                    //if 1st word is less than 2nd word, switch their locations
                    int temp = wordCount.get(i);
                    wordCount.set(i, wordCount.get(j + 1));
                    wordCount.set(j + 1, temp);

                    //if wordCount positions were switched, also switch the occurringWord location
                    String tempString = occurringWords.get(i);
                    occurringWords.set(i, occurringWords.get(j + 1));
                    occurringWords.set(j + 1, tempString);
                }
            }
        }

        //save new list orders into a singular ArrayList, so they can both be returned
        ArrayList<Object> info = new ArrayList<>();
        info.add(occurringWords);
        info.add(wordCount);

        return info;
    }
}
