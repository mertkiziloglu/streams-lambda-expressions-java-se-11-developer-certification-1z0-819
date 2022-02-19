
package com.kiziloglumert.streamslambdas.examples;

import com.kiziloglumert.streamslambdas.ExampleData;
import com.kiziloglumert.streamslambdas.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LambdasExample05 {

    public static void main(String[] args) {
        List<Product> products = ExampleData.getProducts();

        BigDecimal priceLimit = new BigDecimal("5.00");

        List<Product> cheapProducts = new ArrayList<>();

        // BAD PRACTICE! Modifying cheapProducts inside the body of the lambda expression.
        // In general, avoid side effects such as modifying objects from captured variables in lambda expressions.
        products.forEach(product -> {
            if (product.getPrice().compareTo(priceLimit) < 0) {
                cheapProducts.add(product);
            }
        });

        // Print the cheap products.
        cheapProducts.forEach(product -> System.out.println(product));
    }
}
