package com.mso.api_ai.configuration;

public class ConvertToValidation {

    public static boolean isNumber(String number) {
        if (number == null || number.isEmpty()){
            return false;
        }
        String strNumber = number.replace(",", "."); 
        return strNumber.matches("[-+]?[0-9]*\\.?[0-9]+");
    }

    public static Double convertToDouble(String number) throws IllegalArgumentException{
        if (number == null || number.isEmpty()){
            throw new IllegalArgumentException("This valeu is not a number!");
        }
        //String strNumber = number.replace(",", ".");

        return Double.parseDouble(number.replace(",", "."));
    }
    
}