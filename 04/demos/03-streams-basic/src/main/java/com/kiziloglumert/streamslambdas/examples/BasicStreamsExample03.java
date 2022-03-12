
package com.kiziloglumert.streamslambdas.examples;

import com.kiziloglumert.streamslambdas.Category;
import com.kiziloglumert.streamslambdas.ExampleData;
import com.kiziloglumert.streamslambdas.Product;

import java.util.List;
import java.util.regex.Pattern;

public class BasicStreamsExample03 {

    public static void main(String[] args) {
        List<Product> products = ExampleData.getProducts();

        // The filter() intermediate operation filters elements from the stream
        products.stream()
                .filter(product -> product.getCategory() == Category.FOOD)   //the filter category
                .forEach(System.out::println);

        // The map() intermediate operation does a one-to-one transformation on each element
        products.stream()
                .map(product -> String.format("The price of %s is $ %.2f", product.getName(), product.getPrice()))
                .forEach(System.out::println);

        // The flatMap() intermediate operation does a one-to-N transformation on each element
        // The function passed to flatMap() must return a Stream that contains the output elements
        // The streams returned by the calls to the function are "flatted" into a single output stream
        Pattern spaces = Pattern.compile("\\s+");
        products.stream()
                .flatMap(product -> spaces.splitAsStream(product.getName()))  // if you have many elements use the flatmap fuckkkkkkkkkkkk
                .forEach(System.out::println);
    }
}
