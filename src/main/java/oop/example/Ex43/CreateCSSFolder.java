package oop.example.Ex43;

public class CreateCSSFolder {

    public void checkUserResponse(String responseCSS, String siteName)
    {
        //Check if the user wants a CSS folder to be created
        if(responseCSS.equals("y"))
        {
            cssFolder(siteName);
        }

    }


    public void cssFolder(String siteName) {

        //Create a CSS folder

        System.out.print("Created ./" + siteName + "/css/");
    }
}
