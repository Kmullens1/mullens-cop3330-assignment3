package oop.example.Ex43;

import java.io.File;


public class CreateJavaSFolder {

    public boolean checkUserResponse(String responseJava)
    {
        //Check if the user wants a javascript folder to be created
        boolean bool = false;
        if(responseJava.equals("y"))
            bool = true;

        return bool;
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
