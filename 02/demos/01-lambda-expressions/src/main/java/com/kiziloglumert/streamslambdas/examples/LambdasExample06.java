
package com.kiziloglumert.streamslambdas.examples;

import com.kiziloglumert.streamslambdas.ExampleData;
import com.kiziloglumert.streamslambdas.Product;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class LambdasExample06 {

    public static void main(String[] args) {
        List<Product> products = ExampleData.getProducts();

        try (FileWriter writer = new FileWriter("products.txt")) {
        /*   for (Product product : products) {
                writer.write(product.toString() + "\n");
            }*/

           /*  According to forEach(), the lambda expression implements interface Consumer. The accept() method
             of this interface does not declare any checked exceptions, so the lambda expression is not allowed
             to throw any checked exceptions. We are forced to handle the IOException inside the lambda expression.*/
            products.forEach(product -> {
                try {
                    writer.write(product.toString() + "\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        } catch (IOException | RuntimeException e) {
            System.err.println("An exception occurred: " + e.getMessage());
        }
    }
}
