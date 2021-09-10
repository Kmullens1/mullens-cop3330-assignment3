package oop.example.Ex45;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class CreateNewFile {

    void newFile(String outputFileName, String updatedContents) {

        //Write the output to a new file with the name provided by user
        try {
            PrintStream out = new PrintStream(new FileOutputStream(outputFileName));
            out.println(updatedContents);
        }
        //If file isn't found, print error message
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
