/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Keri Mullens
 */
package oop.example.Ex43;

import java.util.Scanner;

public class Ex43 {
    private static final Scanner input = new Scanner(System.in);

    public static void readUserInput() {

        //Ask for the proper user input
        System.out.print("Site name: ");
            String siteName = input.nextLine();
        System.out.print("Author: ");
            String author = input.nextLine();
        System.out.print("Do you want a folder for JavaScript? ");
            String responseJava = input.next();
        System.out.print("Do you want a folder for CSS? ");
            String responseCSS = input.next();
        System.out.println("Created ./" + siteName);

        //Create an HTML File with the correct info embedded within
        CreateHTMLFile html = new CreateHTMLFile();
        html.htmlFile(siteName, author);

        CreateJavaSFolder java = new CreateJavaSFolder();
        //respond to yes or no input from user about Javascript Folder
        java.checkUserResponse(responseJava, siteName);

        CreateCSSFolder css = new CreateCSSFolder();
        //respond to yes or no input from user about CSS Folder
        css.checkUserResponse(responseCSS, siteName);

    }
    public static void main(String[] args) {
        //Website Generator
        /*Programming languages can create files and folders too.
        Create a program that generates a website skeleton with the following specifications:
            Prompt for the name of the site.
            Prompt for the author of the site.
            Ask if the user wants a folder for JavaScript files.
            Ask if the user wants a folder for CSS files.
            Generate an index.html file that contains the name of the site inside the <title> tag
            and the author in a <meta> tag.
        Example Output
            Site name: awesomeco
            Author: Max Power
            Do you want a folder for JavaScript? y
            Do you want a folder for CSS? y
            Created ./awesomeco
            Created ./awesomeco/index.html
            Created ./awesomeco/js/
            Created ./awesomeco/css/        */


        //Read the user Input
        readUserInput();
    }
}
