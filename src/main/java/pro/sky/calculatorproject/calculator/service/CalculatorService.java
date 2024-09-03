package pro.sky.calculatorproject.calculator.service;

import org.springframework.web.bind.annotation.GetMapping;

public interface CalculatorService {
    double getSum(double num1, double num2);

    double getSubtraction(double num1, double num2);

    double getMultiply(double num1, double num2);

    double getDivision(double num1, double num2);

}