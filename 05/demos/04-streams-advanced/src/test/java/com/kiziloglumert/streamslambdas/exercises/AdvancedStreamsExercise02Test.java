package com.kiziloglumert.streamslambdas.exercises;

import com.kiziloglumert.streamslambdas.Category;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class AdvancedStreamsExercise02Test {

    private AdvancedStreamsExercise02 exercise = new AdvancedStreamsExercise02();

    @Test
    @DisplayName("Count products per category")
    void countProductsPerCategory() {
        assertThat(exercise.countProductsPerCategory(TestData.getProducts()))
                .describedAs("Exercise 3: Your solution does not return the correct result.")
                .containsExactlyInAnyOrderEntriesOf(Map.of(Category.FOOD, 2L, Category.UTENSILS, 3L, Category.CLEANING, 1L, Category.OFFICE, 1L));
    }
}
