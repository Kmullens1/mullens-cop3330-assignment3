/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Keri Mullens
 */


package oop.example.Ex44;

import com.google.gson.Gson;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ex44 {

    public static void readFile()
    {
        //JsonReader read = new JsonReader("C:\\Users\\kmull\\Desktop\\Keri's OOP Class\\IntelliJProjects\\Assignment3\\src\\main\\java\\oop\\example\\Ex44\\Product_Data.json");

        try {
            // create Gson instance
            Gson gson = new Gson();
            System.out.println();
            // create a reader
            Reader reader = Files.newBufferedReader(Paths.get("C:\\Users\\kmull\\Desktop\\Keri's OOP Class\\IntelliJProjects\\Assignment3\\src\\main\\java\\oop\\example\\Ex44\\Product_Data.json"));

            // convert JSON string to User object
            Product product = gson.fromJson(reader, Product.class);

            // print user object
            System.out.println(product);

            // close reader
            reader.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {

        //Product Search
        /*Pulling data from a file into a complex data structure makes parsing much simpler.
        Many programming languages support the JSON format, a popular way of representing data.
        Create a program that takes a product name as input and retrieves the current price
        and quantity for that product. The product data is in a data file in the JSON format
        and looks like this:
            {
                "products" : [
                    {"name": "Widget", "price": 25.00, "quantity": 5 },
                    {"name": "Thing", "price": 15.00, "quantity": 5 },
                    {"name": "Doodad", "price": 5.00, "quantity": 10 }
                ]
            }
        Print out the product name, price, and quantity if the product is found. If no product
        matches the search, state that no product was found and start over.
        Example Output
            What is the product name? iPad
            Sorry, that product was not found in our inventory.
            What is the product name? Widget
            Name: Widget
            Price: $25.00
            Quantity on hand: 5
        Constraints
            The file is in the JSON format. Use a JSON parser to pull the values out of the file.
            If no record is found, prompt again.*/



        readFile();

        /*
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        */

    }
}
