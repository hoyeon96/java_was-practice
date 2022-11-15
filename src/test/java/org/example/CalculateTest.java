package org.example;

import org.example.calculator.domain.Calculator;
import org.example.calculator.domain.PositiveNumber;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculateTest {

    @Test
    void calculateTest() {
         int result = Calculator.calculate(new PositiveNumber(11), "+", new PositiveNumber(55));
        assertThat(result).isNotNull();
        System.out.println(result);
    }
}
