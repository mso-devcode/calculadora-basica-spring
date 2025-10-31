package com.mso.api_ai.service;

import org.springframework.stereotype.Service;

import com.mso.api_ai.configuration.ConvertToValidation;
import com.mso.api_ai.exception.RecursoNaoEncontrado;


@Service
public class MathService {

    public Double sum(String numberOne, String numberTwo) throws IllegalArgumentException {    
    if (!ConvertToValidation.isNumber(numberOne) || !ConvertToValidation.isNumber(numberTwo)){
                throw new RecursoNaoEncontrado("This value is not a number");
            }
        return ConvertToValidation.convertToDouble(numberOne) + ConvertToValidation.convertToDouble(numberTwo);
    }
    
    
     public Double subtraction(String numberOne, String numberTwo) {
        if (!ConvertToValidation.isNumber(numberOne) || !ConvertToValidation.isNumber(numberTwo)){
                throw new RecursoNaoEncontrado("This value is not a number");
            }
        return ConvertToValidation.convertToDouble(numberOne) - ConvertToValidation.convertToDouble(numberTwo);
    }
    
     public Double multiplication(String numberOne, String numberTwo) throws IllegalArgumentException {
        if (!ConvertToValidation.isNumber(numberOne) || !ConvertToValidation.isNumber(numberTwo)){
                throw new RecursoNaoEncontrado("This value is not a number");
            }
        return ConvertToValidation.convertToDouble(numberOne) * ConvertToValidation.convertToDouble(numberTwo);
    }

    public Double division(String numberOne, String numberTwo) throws IllegalArgumentException {
        if (!ConvertToValidation.isNumber(numberOne) || !ConvertToValidation.isNumber(numberTwo)){
                throw new RecursoNaoEncontrado("This value is not a number");
            }
        return ConvertToValidation.convertToDouble(numberOne) / ConvertToValidation.convertToDouble(numberTwo);
    }
    
    public Double avarage(String numberOne, String numberTwo) throws IllegalArgumentException {
        if (!ConvertToValidation.isNumber(numberOne) || !ConvertToValidation.isNumber(numberTwo)){
                throw new RecursoNaoEncontrado("This value is not a number");
            }
        return (ConvertToValidation.convertToDouble(numberOne) + ConvertToValidation.convertToDouble(numberTwo)) / 2;
    }

     public Double sqrtRoot(String number) throws IllegalArgumentException {
        if (!ConvertToValidation.isNumber(number)){
                throw new RecursoNaoEncontrado("This value is not a number");
            }
        return Math.sqrt(ConvertToValidation.convertToDouble(number));
       }
    
    
    

}
