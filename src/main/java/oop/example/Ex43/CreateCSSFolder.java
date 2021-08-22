package oop.example.Ex43;

import java.io.File;

public class CreateCSSFolder {

    public void checkUserResponse(String responseCSS, String siteName)
    {
        //Check if the user wants a javascript folder to be created
        if(responseCSS.equals("y"))
            CSSFolder(siteName);
    }



    public void CSSFolder(String siteName)
    {
        //FIXME - .css may not be correct
        File createHTML = new File("C:\\Users\\kmull\\Desktop\\" + siteName + ".css");

        if(createHTML.mkdir())
            System.out.println("Created ./" + siteName + "/css/");
        else
            System.out.println("An error occurred.");
    }
}
