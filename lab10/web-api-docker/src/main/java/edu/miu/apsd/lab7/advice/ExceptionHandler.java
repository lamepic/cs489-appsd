package edu.miu.apsd.lab7.advice;

import edu.miu.apsd.lab7.exception.NotFoundException;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ExceptionHandler {

    public Map<String, String> handleExceptionNotFound(NotFoundException notFoundException){
        Map<String, String> error = new HashMap<>();
        error.put("errorMessage", notFoundException.getMessage());
        return error;
    }
}
