package pro.sky.calculatorproject.calculator.service;

import org.springframework.web.bind.annotation.GetMapping;

public interface CalculatorService {
    Integer getSum(Integer num1, Integer num2);

    Integer getSubtraction(Integer num1, Integer num2);

    Integer getMultiply(Integer num1, Integer num2);

    Double getDivision(Double num1, Double num2);

}