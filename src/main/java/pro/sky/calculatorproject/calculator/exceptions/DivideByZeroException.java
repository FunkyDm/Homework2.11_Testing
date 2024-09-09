package pro.sky.calculatorproject.calculator.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code  = HttpStatus.BAD_REQUEST, reason = "Нельзя делить на ноль")
public class DivideByZeroException extends RuntimeException{
    public DivideByZeroException(String message) {
        super(message);
    }

}
