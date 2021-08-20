package oop.example.Ex43;

public class CreateJavaSFolder {
    public void checkUserResponse(String responseJava, String siteName)
    {
        //Check if the user wants a javascript folder to be created
        if(responseJava.equals("y"))
        {
            javaScriptFolder(siteName);
        }

    }

    public void javaScriptFolder(String siteName) {

        //Create a JavaScriptFolder

        System.out.print("Created ./" + siteName + "/js/");

    }
}
