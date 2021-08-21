package oop.example.Ex43;

import java.io.*;

public class CreateHTMLFile {
    public void htmlFile(String siteName, String author){
        File createHTML = new File("C:\\Users\\kmull\\Desktop\\" + siteName + ".html");
        try
        {
            if(createHTML.createNewFile())
            {
                System.out.print("Created ./" + siteName + "/index.html");

                BufferedWriter bw = new BufferedWriter(new FileWriter(createHTML));
                bw.write("<title>" + siteName + "</title><meta>" + author + "</meta>");
                bw.newLine();
                bw.close();
            }
            else
                System.out.print("This file already exists.");

        } catch(IOException e){
            System.out.print("Unknown Error Occurred");
            e.printStackTrace();
        }
    }
}
