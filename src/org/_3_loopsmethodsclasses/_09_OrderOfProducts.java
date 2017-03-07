package org._3_loopsmethodsclasses;


//Create a class Product to hold products, which have name (string) and price (decimal number).
// Read from a text file named "Products.txt" a list of product with prices and keep them in a list of products.
// Each product will be in format name + space + price. You should hold the products in objects of class Product.
// Read from a text file named "Order.txt" an order of products with quantities.
// Each order line will be in format product + space + quantity. Calculate and print in a
// text file "Output.txt" the total price of the order. Ensure you close correctly all used resources.

import java.io.*;
import java.util.*;

public class _09_OrderOfProducts {

    public static void main(String[] args) {
        String inputFilePrice = "src/org/_3_loopsmethodsclasses/OrderOfProductsInputPrice.txt";
        String outputFile = "src/org/_3_loopsmethodsclasses/OrderOfProductsOutput.txt";
        String inputFileQuantities = "src/org/_3_loopsmethodsclasses/OrderOfProductsInputQuantities.txt";

        List<Product> products = new ArrayList<Product>();


        try (
                BufferedReader fileReader = new BufferedReader(new FileReader(inputFilePrice));
        ) {
            String input = null;
            while ((input = fileReader.readLine()) != null) {

                String[] token = input.split(" ");
                Product product = new Product(token[0], Double.parseDouble(token[1]));

                products.add(product);
            }


        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

        try (
                BufferedReader fileReader = new BufferedReader(new FileReader(inputFileQuantities));
                BufferedWriter fileWriter = new BufferedWriter(new FileWriter(outputFile));
        ) {
            String input = null;
            double sum = 0;
            while ((input = fileReader.readLine()) != null) {
                String[] token = input.split(" ");
//                Map<Double, String> product = new HashMap<Double, String>();
//                product.put(Double.parseDouble(token[0]), token[1]);
                double quantity = Double.parseDouble(token[0]);
                String itemName = token[1];

                for (Product product : products){
                    if (itemName.equals(product.getName())){
                        sum += product.getPrice() * quantity;
                    }
                }
            }

            fileWriter.write(String.format("%.2f", sum));

        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}




