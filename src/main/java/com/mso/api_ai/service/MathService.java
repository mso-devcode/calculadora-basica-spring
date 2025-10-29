package com.mso.api_ai.service;

import org.springframework.stereotype.Service;

import com.mso.api_ai.configuration.ConvertToValidation;

@Service
public class MathService {

    public Double sum(String numberOne, String numberTwo) throws IllegalArgumentException {
        if (!ConvertToValidation.isNumber(numberOne) || !ConvertToValidation.isNumber(numberTwo)){
                throw new IllegalArgumentException("This value is not a number");
            }
        return ConvertToValidation.convertToDouble(numberOne) + ConvertToValidation.convertToDouble(numberTwo);
    }
    
}
