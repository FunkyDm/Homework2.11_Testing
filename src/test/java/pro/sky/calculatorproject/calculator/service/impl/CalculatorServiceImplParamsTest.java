package pro.sky.calculatorproject.calculator.service.impl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplParamsTest {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideParamsForSumTests")
    void getSum(Integer num1, Integer num2, Integer expected) {
        Integer result = out.getSum(num1, num2);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForSubstractionTests")
    void getSubtraction(Integer num1, Integer num2, Integer expected) {
        Integer result = out.getSubtraction(num1, num2);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultiplyTests")
    void getMultiply(Integer num1, Integer num2, Integer expected) {
        Integer result = out.getMultiply(num1, num2);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDivideTests")
    void getDivision(double num1, double num2, double expected) {
        double result = out.getDivision(num1, num2);
        assertEquals(expected, result);
    }

    public static Stream<Arguments> provideParamsForSumTests() {
        return Stream.of(
                Arguments.of(3, 2, 5)
        );
    }

    public static Stream<Arguments> provideParamsForSubstractionTests() {
        return Stream.of(
                Arguments.of(5, 2, 3)
        );
    }

    public static Stream<Arguments> provideParamsForMultiplyTests() {
        return Stream.of(
                Arguments.of(5, 2, 10)
        );
    }

    public static Stream<Arguments> provideParamsForDivideTests() {
        return Stream.of(
                Arguments.of(10.0, 2.0, 5.0)
        );
    }

}