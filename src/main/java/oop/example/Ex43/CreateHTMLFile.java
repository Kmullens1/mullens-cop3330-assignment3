package oop.example.Ex43;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateHTMLFile {
    public void htmlFile(String siteName, String author){
        File createHTML = new File("C:\\Users\\kmull\\Desktop\\" + siteName + ".html");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(siteName + ".html");
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter writer = new BufferedWriter(fileWriter);
        try {
            if(createHTML.createNewFile())
                System.out.print("Created ./" + siteName + "/index.html");
            else
                System.out.print("This file already exists.");

            writer.write("<title>" + siteName + "<title>" + "<meta>" + author + "<meta>");
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.out.print("Unknown Error Occurred");
            e.printStackTrace();
        }
    }
}
