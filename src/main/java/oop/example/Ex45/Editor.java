package oop.example.Ex45;

public class Editor {
    String changeToUse(String fileContents) {

        //Search for occurrences of the word "utilize"
        String updatedContents = "Error";
        if(fileContents != null)
        {
            //Replace "utilize" with "use"
            updatedContents = fileContents.replace("utilize", "use");
            updatedContents = updatedContents.replace("Utilize", "Use");
        }

        //Return new String
        return updatedContents;
    }
}
