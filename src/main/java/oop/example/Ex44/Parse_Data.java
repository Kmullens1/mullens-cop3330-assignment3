package oop.example.Ex44;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Parse_Data {

    private static final Scanner input = new Scanner(System.in);

    public ArrayList<Object> parsing(InventoryList inventoryList) {

        boolean variable = false;
        String name = "";
        double price = -1;
        int quantity = -1;
        ArrayList<Object> data = new ArrayList<>();

        while (!variable) {
            String item = readProductName();

            for (Product x : inventoryList.products) {
                if (x.name.equals(item)) {
                    variable = true;
                    name = x.name;
                    price = x.price;
                    quantity = x.quantity;
                }
            }

            //Add product data to a list for testing purposes
            data.add(name);
            data.add(price);
            data.add(quantity);

            output(variable, name, price, quantity);
        }

        return data;
    }

    private String readProductName()
    {
        System.out.print("What is the product name? ");
        return input.nextLine();
    }


    private void output(boolean variable, String name, double price, int quantity) {

        DecimalFormat df = new DecimalFormat("###.00");

        if (variable) {
            System.out.print("Name: " + name +
                    "\nPrice: $" + df.format(price) +
                    "\nQuantity on hand: " + quantity);
        } else
            System.out.print("Sorry, that product was not found in our inventory.\n");
    }

}
