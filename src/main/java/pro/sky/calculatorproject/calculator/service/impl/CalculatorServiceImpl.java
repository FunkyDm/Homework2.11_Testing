package pro.sky.calculatorproject.calculator.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.calculatorproject.calculator.exceptions.DivideByZeroException;
import pro.sky.calculatorproject.calculator.exceptions.MissingVariableException;
import pro.sky.calculatorproject.calculator.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public Integer getSum(Integer num1, Integer num2) {
        if(num1 == null || num2 == null){
            throw new MissingVariableException("Отсуствует неооходимое значение");
        }
        return num1 + num2;
    }

    @Override
    public Integer getSubtraction(Integer num1, Integer num2) {
        if(num1 == null || num2 == null){
            throw new MissingVariableException("Отсуствует неооходимое значение");
        }
        return num1 - num2;
    }

    @Override
    public Integer getMultiply(Integer num1, Integer num2) {
        if(num1 == null || num2 == null){
            throw new MissingVariableException("Отсуствует неооходимое значение");
        }
        return num1 * num2;
    }

    @Override
    public Double getDivision(Double num1, Double num2) {
        if(num1 == null || num2 == null){
            throw new MissingVariableException("Отсуствует неооходимое значение");
        }
        if(num2 != 0){
            return num1 / num2;
        }
        throw new DivideByZeroException("На ноль делить нельзя");
    }

}
