package com.kiziloglumert.streamslambdas.exercises;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FunctionalInterfacesExercise03Test {

    private FunctionalInterfacesExercise03 exercise = new FunctionalInterfacesExercise03();

    @Test
    @DisplayName("Do calculations")
    void calculate() {
        assertThat(exercise.calculate(2.5, 1.0, FunctionalInterfacesExercise03.ArithmeticOperation.ADD)).isEqualTo(3.5);
        assertThat(exercise.calculate(4.5, 2.5, FunctionalInterfacesExercise03.ArithmeticOperation.SUBTRACT)).isEqualTo(2.0);
        assertThat(exercise.calculate(2.25, 3.0, FunctionalInterfacesExercise03.ArithmeticOperation.MULTIPLY)).isEqualTo(6.75);
        assertThat(exercise.calculate(10.0, 4.0, FunctionalInterfacesExercise03.ArithmeticOperation.DIVIDE)).isEqualTo(2.5);
    }
}
