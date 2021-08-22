package oop.example.Ex43;

import java.io.File;


public class CreateJavaSFolder {

    public void checkUserResponse(String responseJava, String siteName)
    {
        //Check if the user wants a javascript folder to be created
        if(responseJava.equals("y"))
            javaScriptFolder(siteName);
    }


    public void javaScriptFolder(String siteName)
    {
        //Create a JavaScriptFolder
        //FIXME - .js may not be correct
        File createHTML = new File("C:\\Users\\kmull\\Desktop\\" + siteName + ".js");

        if(createHTML.mkdir())
            System.out.println("Created ./" + siteName + "/js/");
        else
            System.out.println("An error occurred.");
    }
}
