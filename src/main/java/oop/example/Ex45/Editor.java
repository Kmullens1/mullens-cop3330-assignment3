package oop.example.Ex45;

public class Editor {
    String changeToUse(String fileContents) {

        //Search for occurrences of the word "utilize" (for loop)
        //Replace "utilize" with "use"
        String updatedContents = "Error";
        if(fileContents != null)
        {
            updatedContents = fileContents.replace("utilize", "use");
            updatedContents = updatedContents.replace("Utilize", "Use");
        }

        //Return new String
        return updatedContents;
    }
}
