package com.kiziloglumert.streamslambdas.exercises;

import com.kiziloglumert.streamslambdas.Category;
import com.kiziloglumert.streamslambdas.Product;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

import static org.assertj.core.api.Assertions.assertThat;

class FunctionalInterfacesExercise01Test {

    private FunctionalInterfacesExercise01 exercise = new FunctionalInterfacesExercise01();

    @Test
    @DisplayName("Filter products")
    void filterProducts() {
        Assertions.assertThat(exercise.filterProducts(TestData.getProducts(), (Predicate<Product>) product -> product.getCategory() == Category.FOOD))
                .describedAs("Exercise 1: When searching for FOOD products, only those should be returned.")
                .containsExactly(TestData.APPLES, TestData.SPAGHETTI, TestData.COFFEE);

        Assertions.assertThat(exercise.filterProducts(TestData.getProducts(), (Predicate<Product>) product -> product.getCategory() != Category.FOOD))
                .describedAs("Exercise 2: When searching for non-FOOD products, only those should be returned.")
                .containsExactly(TestData.PENCILS, TestData.PLATES, TestData.DETERGENT);
    }
}
