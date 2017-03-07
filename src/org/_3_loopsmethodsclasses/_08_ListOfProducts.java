package org._3_loopsmethodsclasses;


//Create a class Product to hold products, which have name (string) and price (decimal number).
// Read from a text file named "Input.txt" a list of products.
// Each product will be in format name + space + price.
// You should hold the products in objects of class Product.
// Sort the products by price and write them in format price + space + name in a file named "Output.txt".
// Ensure you close correctly all used resources.


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _08_ListOfProducts {

    public static void main(String[] args) {
        String inputFile = "src/org/_3_loopsmethodsclasses/ListOfProductsInput.txt";
        String outputFile = "src/org/_3_loopsmethodsclasses/ListOfProductsOutput.txt";
        List<Product> products = new ArrayList<Product>();


        try (
                BufferedReader fileReader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter fileWriter = new BufferedWriter(new FileWriter(outputFile));
        ) {
            String input = null;
            while ((input = fileReader.readLine()) != null) {

                String[] token = input.split(" ");
                Product product = new Product(token[0], Double.parseDouble(token[1]));

                products.add(product);
            }

//            products.sort(products);

            for (Product product : products){
                fileWriter.write(product.getPrice() + " " + product.getName() + "\n");
            }


        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}




