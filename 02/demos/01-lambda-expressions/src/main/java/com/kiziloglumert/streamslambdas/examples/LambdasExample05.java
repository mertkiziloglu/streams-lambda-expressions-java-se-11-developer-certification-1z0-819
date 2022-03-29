
package com.kiziloglumert.streamslambdas.examples;

import com.kiziloglumert.streamslambdas.ExampleData;
import com.kiziloglumert.streamslambdas.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class LambdasExample05 {

    public static void main(String[] args) {
        List<Product> products = ExampleData.getProducts();

        BigDecimal priceLimit = new BigDecimal("5.00");

        List<Product> cheapProducts = new ArrayList<>();
        AtomicInteger count = new AtomicInteger();

        // BAD PRACTICE! Modifying cheapProducts inside the body of the lambda expression.
        // In general, avoid side effects such as modifying objects from captured variables in lambda expressions.
        products.forEach(product -> {
            if (product.getPrice().compareTo(priceLimit) < 0) {
                cheapProducts.add(product);
                count.getAndIncrement();
            }
        });

        // Print the cheap products.
        cheapProducts.forEach(System.out::println);
        System.out.println(count);
    }
}
