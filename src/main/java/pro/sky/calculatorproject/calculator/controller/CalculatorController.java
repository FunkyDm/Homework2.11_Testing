package pro.sky.calculatorproject.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculatorproject.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String getGreeting(){
        return "Добро пожаловать в калькулятор.";
    }

    @GetMapping("/plus")
    public String getSum(@RequestParam(value = "num1") Integer num1,
                         @RequestParam(value = "num2") Integer num2){
        Integer result = calculatorService.getSum(num1,num2);
        return num1 + " + " + num2 + " = " + result;
    }

    @GetMapping("/minus")
    public String getSubtraction(@RequestParam(value = "num1") Integer num1,
                                 @RequestParam(value = "num2") Integer num2){
        Integer result = calculatorService.getSubtraction(num1,num2);
        return num1 + " - " + num2 + " = " + result;
    }

    @GetMapping("/multiply")
    public String getMultiply(@RequestParam(value = "num1") Integer num1,
                              @RequestParam(value = "num2") Integer num2){
        Integer result = calculatorService.getMultiply(num1,num2);
        return num1 + " * " + num2 + " = " + result;
    }

    @GetMapping("divide")
    public String getDivision(@RequestParam(value = "num1") Double num1,
                              @RequestParam(value = "num2") Double num2){
        Double result = calculatorService.getDivision(num1,num2);
        return num1 + " / " + num2 + " = " + result;
    }

}
