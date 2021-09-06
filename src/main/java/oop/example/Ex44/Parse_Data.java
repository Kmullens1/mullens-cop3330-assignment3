package oop.example.Ex44;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Parse_Data {

    private static final Scanner input = new Scanner(System.in);

    public void parsing(InventoryList inventoryList) {

        boolean variable = false;

        while (!variable) {

            System.out.print("What is the product name? ");
            String item = input.nextLine();

            ArrayList<Object> data;
            data = searchProducts(inventoryList, item);

            variable = (boolean) data.get(0);

            String name = (String) data.get(1);
            double price = (double) data.get(2);
            int quantity = (int) data.get(3);

            output(variable, name, price, quantity);
        }

    }

    private ArrayList<Object> searchProducts(InventoryList inventoryList, String item)
    {
        ArrayList<Object> data = new ArrayList<>();

        boolean variable = false;
        String name = "";
        double price = -1;
        int quantity = -1;

        for (Product x : inventoryList.products) {
            if (x.name.equals(item)) {
                variable = true;
                name = x.name;
                price = x.price;
                quantity = x.quantity;
            }
        }

        //Add product data to a list for testing purposes
        data.add(variable);
        data.add(name);
        data.add(price);
        data.add(quantity);

        return data;
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
