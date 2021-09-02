/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Keri Mullens
 */


package oop.example.Ex44;

import com.google.gson.Gson;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ex44 {

    private static final Scanner input = new Scanner(System.in);

    public static void readFile()
    {
        try {
            // create Gson instance
            Gson gson = new Gson();

            // create a reader
            Reader reader = Files.newBufferedReader(Paths.get("src/main/java/oop/example/Ex44/Product_Data.json"));

            // convert JSON string to User object
            Inventory product = gson.fromJson(reader, Inventory.class);

            // print user object

            boolean variable = false;
            String name = "";
            double price = -1;
            int quantity = -1;

            while(!variable) {
                System.out.print("What is the product name? ");
                String item = input.nextLine();

                for (Product x : product.products) {
                    if (x.name.equals(item)) {
                        variable = true;
                        name = x.name;
                        price = x.price;
                        quantity = x.quantity;
                    }

                }

                if (variable) {
                    System.out.print("Name: " + name +
                            "\nPrice: $" + price +
                            "\nQuantity on hand: " + quantity);
                } else
                    System.out.print("Sorry, that product was not found in our inventory.\n");
            }


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
