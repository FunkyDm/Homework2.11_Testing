package pro.sky.calculatorproject.calculator.service.impl;

import org.junit.jupiter.api.Test;
import pro.sky.calculatorproject.calculator.exceptions.DivideByZeroException;
import pro.sky.calculatorproject.calculator.exceptions.MissingVariableException;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.calculatorproject.calculator.constants.CalculatorServiceImplTestConstants.*;

class CalculatorServiceImplTest {
    CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    public void getSum() {
        Integer actual = out.getSum(NUM_PLUS_1, NUM_PLUS_2);
        Integer expected = NUM_PLUS_1 + NUM_PLUS_2;
        assertEquals(expected, actual);
    }

    @Test
    public void getSubtraction() {
        Integer actual = out.getSubtraction(NUM_MINUS_1, NUM_MINUS_2);
        Integer expected = NUM_MINUS_1 - NUM_MINUS_2;
        assertEquals(expected, actual);
    }

    @Test
    public void getMultiply() {
        Integer actual = out.getMultiply(NUM_MULTIPLY_1, NUM_MULTIPLY_2);
        Integer expected = NUM_MULTIPLY_1 * NUM_MULTIPLY_2;
        assertEquals(expected, actual);
    }

    @Test
    public void getDivision() {
        Double actual = out.getDivision(NUM_DIVIDE_1, NUM_DIVIDE_2);
        Double expected = NUM_DIVIDE_1 / NUM_DIVIDE_2;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnException_WhenOneParamIsNull_WithMethodGetSum(){
        assertThrows(MissingVariableException.class, () -> out.getSum(NUM_NULL_INTEGER, NUM_PLUS_2));
    }

    @Test
    public void shouldReturnException_WhenOneParamIsNull_WithMethodGetSubtraction(){
        assertThrows(MissingVariableException.class, () -> out.getSubtraction(NUM_NULL_INTEGER, NUM_MINUS_2));
    }

    @Test
    public void shouldReturnException_WhenOneParamIsNull_WithMethodGetMultiply(){
        assertThrows(MissingVariableException.class, () -> out.getMultiply(NUM_NULL_INTEGER, NUM_MULTIPLY_2));
    }

    @Test
    public void shouldReturnException_WhenOneParamIsNull_WithMethodGetDivide(){
        assertThrows(MissingVariableException.class, () -> out.getDivision(NUM_NULL_DOUBLE, NUM_DIVIDE_2));
    }

    @Test
    public void getDivisionByZero() {
        assertThrows(DivideByZeroException.class, () -> out.getDivision(NUM_DIVIDE_1, NUM_ZERO));
    }

}