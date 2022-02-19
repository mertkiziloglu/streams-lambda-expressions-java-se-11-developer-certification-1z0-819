package com.kiziloglumert.streamslambdas.exercises;

import com.kiziloglumert.streamslambdas.Product;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BasicStreamsExercise04Test {

    private static final List<Product> TEST_PRODUCTS_1 = List.of(TestData.PENCILS, TestData.DISH_BRUSH, TestData.PLATES, TestData.SCOURER, TestData.SPAGHETTI, TestData.FORKS, TestData.DETERGENT);
    private static final List<Product> TEST_PRODUCTS_2 = List.of(TestData.PENCILS, TestData.PLATES, TestData.SPAGHETTI, TestData.FORKS);

    private BasicStreamsExercise04 exercise = new BasicStreamsExercise04();

    @Test
    @DisplayName("Find cheapest cleaning product")
    void findCheapestCleaning() {
        Assertions.assertThat(exercise.findCheapestCleaning(new ArrayList<>(TEST_PRODUCTS_1)))
                .describedAs("Exercise 4: Your solution did not find the cheapest cleaning product.")
                .contains(TestData.SCOURER);

        Assertions.assertThat(exercise.findCheapestCleaning(new ArrayList<>(TEST_PRODUCTS_2)))
                .describedAs("Exercise 4: Your solution found something, but an empty result was expected.")
                .isNotPresent();
    }
}
