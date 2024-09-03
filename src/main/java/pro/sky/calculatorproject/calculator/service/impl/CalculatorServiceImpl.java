package pro.sky.calculatorproject.calculator.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.calculatorproject.calculator.exceptions.DivideByZeroException;
import pro.sky.calculatorproject.calculator.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public double getSum(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double getSubtraction(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double getMultiply(double num1, double num2) {
        return num1 * num2;
    }

    @Override
    public double getDivision(double num1, double num2) {
        if(num2 != 0){
            return num1 / num2;
        }
        throw new DivideByZeroException("На ноль делить нельзя");
    }

}
