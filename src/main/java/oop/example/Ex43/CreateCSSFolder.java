package oop.example.Ex43;

import java.io.File;

public class CreateCSSFolder {


    public boolean checkUserResponse(String responseCSS)
    {
        //Check if the user wants a css folder to be created
        boolean bool = false;
        if(responseCSS.equals("y"))
            bool = true;

        return bool;
    }



    public void cssFolder(String siteName)
    {
        //FIXME - .css may not be correct
        File createHTML = new File("C:\\Users\\kmull\\Desktop\\" + siteName + ".css");

        if(createHTML.mkdir())
            System.out.println("Created ./" + siteName + "/css/");
        else
            System.out.println("An error occurred.");
    }
}
