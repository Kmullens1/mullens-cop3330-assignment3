package oop.example.Ex44;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


class Parse_DataTest {

    @Test
    void searchProducts() {
        ArrayList<Object> expected = new ArrayList<>();
        expected.add(true);
        expected.add("Widget");
        expected.add(25.0);
        expected.add(5);

        ArrayList<Object> actual = new ArrayList<>();

        try {
            Gson gson = new Gson();

            Reader read = Files.newBufferedReader(Paths.get("src/main/java/oop/example/Ex44/Product_Data.json"));
            InventoryList inventoryList = gson.fromJson(read, InventoryList.class);

            String item = "Widget";
            Parse_Data search = new Parse_Data();
            actual = search.searchProducts(inventoryList, item);

            read.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        assertEquals(expected, actual);

    }
}