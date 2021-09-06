package oop.example.Ex44;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Parse_Data {

    private static final Scanner input = new Scanner(System.in);

    public void parsing(InventoryList inventoryList) {
        //define a boolean variable to signify when a desired product exists in the list
        boolean variable = false;

        //Keep asking for desired product until user input is found within the list
        while (!variable) {
            //Prompt user for desired product name
            System.out.print("What is the product name? ");
            //Read user input
            String item = input.nextLine();

            //create an ArrayList to hold Product data for easy sharing with other functions
            ArrayList<Object> data;
            //Call searchProducts function to scan the list for desired Product
            data = searchProducts(inventoryList, item);

            //add acquired data to the data ArrayList created above
            variable = (boolean) data.get(0);
            String name = (String) data.get(1);
            double price = (double) data.get(2);
            int quantity = (int) data.get(3);

            //Call the output function to properly print the desired Product info or the request to try again
            output(variable, name, price, quantity);
        }

    }


    public ArrayList<Object> searchProducts(InventoryList inventoryList, String item)
    {
        //Create ArrayList to hold Product data for easy sharing with other functions
        ArrayList<Object> data = new ArrayList<>();

        //initialize variable data values
        boolean variable = false;
        String name = "";
        double price = -1;
        int quantity = -1;

        //Search the list for desired Product info
        for (Product x : inventoryList.products) {
            if (x.name.equals(item)) {
                //Change variable value to true if desired Product info is found
                variable = true;
                //Update name, price, and quantity values to desired Product data
                name = x.name;
                price = x.price;
                quantity = x.quantity;
            }
        }

        //Add product data to a list to share with other functions and for testing purposes
        data.add(variable);
        data.add(name);
        data.add(price);
        data.add(quantity);

        return data;
    }


    private void output(boolean variable, String name, double price, int quantity) {
        //format price output to proper dollar format
        DecimalFormat df = new DecimalFormat("###.00");

        //Print desired Product data if data was found within the list
        if (variable) {
            System.out.print("Name: " + name +
                    "\nPrice: $" + df.format(price) +
                    "\nQuantity on hand: " + quantity);
        } else //OR request another input for a retry
            System.out.print("Sorry, that product was not found in our inventory.\n");
    }

}
