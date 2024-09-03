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
    void getSum(double num1, double num2, double expected) {
        double result = out.getSum(num1, num2);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForSubstractionTests")
    void getSubtraction(double num1, double num2, double expected) {
        double result = out.getSubtraction(num1, num2);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultiplyTests")
    void getMultiply(double num1, double num2, double expected) {
        double result = out.getMultiply(num1, num2);
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
                Arguments.of(3.0, 2.5, 5.5)
        );
    }

    public static Stream<Arguments> provideParamsForSubstractionTests() {
        return Stream.of(
                Arguments.of(5.0, 2.0, 3.0)
        );
    }

    public static Stream<Arguments> provideParamsForMultiplyTests() {
        return Stream.of(
                Arguments.of(5.0, 2.0, 10.0)
        );
    }

    public static Stream<Arguments> provideParamsForDivideTests() {
        return Stream.of(
                Arguments.of(10.0, 2.0, 5.0)
        );
    }

}