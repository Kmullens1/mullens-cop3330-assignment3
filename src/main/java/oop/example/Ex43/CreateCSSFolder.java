package oop.example.Ex43;

public class CreateCSSFolder {

    public void checkUserResponse(String responseCSS, String siteName)
    {
        //Check if the user wants a javascript folder to be created
        if(responseCSS.equals("y"))
        {
            CSSFolder(responseCSS, siteName);
        }

    }



    public String CSSFolder(String responseCSS, String siteName) {
        String CSSAddress = ""; //FIXME initialized to zero for the time being

        if(responseCSS.equals("y"))
        {

            System.out.print("Created ./" + siteName + "/css/");
        }

        return CSSAddress;
    }
}
