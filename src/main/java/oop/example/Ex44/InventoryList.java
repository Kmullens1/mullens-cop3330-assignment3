package oop.example.Ex44;

import java.util.List;

public class InventoryList {
    //create an object with lists of Products objects
    public List<Product> products;

    public InventoryList(List<Product> list)
    {
        this.products = list;
    }
}
