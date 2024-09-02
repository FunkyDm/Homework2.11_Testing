package pro.sky.calculatorproject.calculator.service.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pro.sky.calculatorproject.calculator.exceptions.DivideByZeroException;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {
    private double num1;
    private double num2;

    @BeforeEach
    public void setUp() {
        num1 = 10;
        num2 = 2;
    }

    @Test
    public void getSum() {
        double actual = 0;

        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        actual = calculatorService.getSum(num1, num2);

        double expected = num1 + num2;

        assertEquals(expected, actual);
    }

    @Test
    public void getSubtraction() {
        double actual = 0;

        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        actual = calculatorService.getSubtraction(num1, num2);

        double expected = num1 - num2;

        assertEquals(expected, actual);
    }

    @Test
    public void getMultiply() {
        double actual = 0;

        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        actual = calculatorService.getMultiply(num1, num2);

        double expected = num1 * num2;

        assertEquals(expected, actual);
    }

    @Test
    public void getDivision() {
        double actual = 0;

        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        actual = calculatorService.getDivision(num1, num2);

        double expected = num1 / num2;

        assertEquals(expected, actual);
    }

//    @Test
//    public void getDivisionByZero() {
//        double actual = 0;
//
//        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
//        actual = calculatorService.getDivision(num1, num2);
//
//        double expected = num1 / num2;
//
//        assertThrows(DivideByZeroException.class, );
//    }
}