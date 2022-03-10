
package com.kiziloglumert.streamslambdas.examples;

import com.kiziloglumert.streamslambdas.Category;
import com.kiziloglumert.streamslambdas.ExampleData;
import com.kiziloglumert.streamslambdas.Product;

import java.util.List;
import java.util.stream.Stream;

public class BasicStreamsExample01 {

    public static void main(String[] args) {
        List<Product> products = ExampleData.getProducts();

        // Streams are lazy - without a terminal operation, no work is done
        // When you call intermediate operations on a stream, you're only building the pipeline;
        // no elements are flowing through it yet
        Stream<Product> stream = products
                .stream()
                .map(product -> {System.out.println(product);
            return product;
        });

        // When you call a terminal operation, the stream will do the work
        stream.forEach(product -> {});


        //simple used filter
        /*products.stream()
                .filter(product -> product.getCategory()== Category.FOOD)
                .map(Product::getName)
                .forEach(System.out::println);*/
    }
}
