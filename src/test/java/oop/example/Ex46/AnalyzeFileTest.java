package oop.example.Ex46;

import oop.example.Ex45.Editor;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AnalyzeFileTest {

    ////Word List Tests///////////////////////////////////////////////////////////////////////
    @Test
    void wordList_Original_Test_String() {
        AnalyzeFile analyze = new AnalyzeFile();

        String fileContents = "badger badger badger badger mushroom mushroom snake badger badger badger";

        ArrayList<String> expected = new ArrayList<>();
        expected.add("badger");
        expected.add("mushroom");
        expected.add("snake");

        ArrayList<String> actual = analyze.wordList(fileContents);

        assertEquals(expected, actual);
    }

    @Test
    void wordList_Uppercase_and_Lowercase_File_Contents() {
        AnalyzeFile analyze = new AnalyzeFile();

        String fileContents = "Badger badger badger Badger mushroom mushRoom snake badger badger badger";

        //Expected in order of most to least frequent
        ArrayList<String> expected = new ArrayList<>();
        expected.add("badger");
        expected.add("Badger");
        expected.add("mushroom");
        expected.add("mushRoom");
        expected.add("snake");

        ArrayList<String> actual = analyze.wordList(fileContents);

        assertEquals(expected, actual);
    }


    ////Word Counter Tests////////////////////////////////////////////////////////////////////
    @Test
    void wordCounter_Original_Test_String() {
        AnalyzeFile analyze = new AnalyzeFile();

        String[] arrayOfContents = {"badger", "badger", "badger", "badger", "mushroom", "mushroom", "snake", "badger", "badger", "badger"};

        ArrayList<String> occurringWords = new ArrayList<>();
        occurringWords.add("badger");
        occurringWords.add("mushroom");
        occurringWords.add("snake");


        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(7);
        expected.add(2);
        expected.add(1);

        ArrayList<Integer> actual = analyze.wordCounter(arrayOfContents, occurringWords);

        assertEquals(expected, actual);
    }

    @Test
    void wordCounter_Different_Size_Test_String() {
        AnalyzeFile analyze = new AnalyzeFile();

        String[] arrayOfContents = {"badger", "badger", "badger", "mushroom", "mushroom", "badger", "badger", "badger"};

        ArrayList<String> occurringWords = new ArrayList<>();
        occurringWords.add("badger");
        occurringWords.add("mushroom");


        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(6);
        expected.add(2);

        ArrayList<Integer> actual = analyze.wordCounter(arrayOfContents, occurringWords);

        assertEquals(expected, actual);
    }
    ////Sort Word Count Tests/////////////////////////////////////////////////////////////////
    @Test
    void sortWordCount_Original_Test_String() {
        AnalyzeFile analyze = new AnalyzeFile();

        ArrayList<String> occurringWords = new ArrayList<>();
        occurringWords.add("badger");
        occurringWords.add("mushroom");
        occurringWords.add("snake");

        ArrayList<Integer> wordCount = new ArrayList<>();
        wordCount.add(7);
        wordCount.add(2);
        wordCount.add(1);

        //resorted wordCount in order of largest to smallest
        ArrayList<String> newOccurringWords = new ArrayList<>();
        newOccurringWords.add("badger");
        newOccurringWords.add("mushroom");
        newOccurringWords.add("snake");

        ArrayList<Integer> newWordCount = new ArrayList<>();
        newWordCount.add(7);
        newWordCount.add(2);
        newWordCount.add(1);

        ArrayList<Object> expected = new ArrayList<>();
        expected.add(newOccurringWords);
        expected.add(newWordCount);

        ArrayList<Object> actual = analyze.sortWordCount(wordCount, occurringWords);

        assertEquals(expected, actual);
    }

    @Test
    void sortWordCount_Out_Of_Frequency_Order() {
        AnalyzeFile analyze = new AnalyzeFile();

        ArrayList<String> occurringWords = new ArrayList<>();
        occurringWords.add("badger");
        occurringWords.add("mushroom");
        occurringWords.add("snake");
        occurringWords.add("dog");
        occurringWords.add("cats");

        ArrayList<Integer> wordCount = new ArrayList<>();
        wordCount.add(7);
        wordCount.add(2);
        wordCount.add(1);
        wordCount.add(9);
        wordCount.add(3);

        //resorted wordCount in order of largest to smallest
        ArrayList<String> newOccurringWords = new ArrayList<>();
        newOccurringWords.add("dog");
        newOccurringWords.add("badger");
        newOccurringWords.add("cats");
        newOccurringWords.add("mushroom");
        newOccurringWords.add("snake");

        ArrayList<Integer> newWordCount = new ArrayList<>();
        newWordCount.add(9);
        newWordCount.add(7);
        newWordCount.add(3);
        newWordCount.add(2);
        newWordCount.add(1);

        ArrayList<Object> expected = new ArrayList<>();
        expected.add(newOccurringWords);
        expected.add(newWordCount);

        ArrayList<Object> actual = analyze.sortWordCount(wordCount, occurringWords);

        assertEquals(expected, actual);
    }
}