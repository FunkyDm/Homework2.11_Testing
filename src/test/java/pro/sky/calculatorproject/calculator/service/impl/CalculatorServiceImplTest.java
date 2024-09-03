package pro.sky.calculatorproject.calculator.service.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pro.sky.calculatorproject.calculator.exceptions.DivideByZeroException;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.calculatorproject.calculator.constants.CalculatorServiceImplTestConstants.*;

class CalculatorServiceImplTest {
    CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    public void getSum() {
        double actual = out.getSum(NUM_PLUS_1, NUM_PLUS_2);
        double expected = NUM_PLUS_1 + NUM_PLUS_2;
        assertEquals(expected, actual);
    }

    @Test
    public void getSubtraction() {
        double actual = out.getSubtraction(NUM_MINUS_1, NUM_MINUS_2);
        double expected = NUM_MINUS_1 - NUM_MINUS_2;
        assertEquals(expected, actual);
    }

    @Test
    public void getMultiply() {
        double actual = out.getMultiply(NUM_MULTIPLY_1, NUM_MULTIPLY_2);
        double expected = NUM_MULTIPLY_1 * NUM_MULTIPLY_2;
        assertEquals(expected, actual);
    }

    @Test
    public void getDivision() {
        double actual = out.getDivision(NUM_DIVIDE_1, NUM_DIVIDE_2);
        double expected = NUM_DIVIDE_1 / NUM_DIVIDE_2;
        assertEquals(expected, actual);
    }

    @Test
    public void getDivisionByZero() {
        CalculatorServiceImpl out = new CalculatorServiceImpl();
        assertThrows(DivideByZeroException.class, () -> out.getDivision(NUM_DIVIDE_1, NUM_NULL));
    }

}