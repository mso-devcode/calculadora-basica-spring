package com.mso.api_ai.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mso.api_ai.service.MathService;

@RestController
@RequestMapping("/api")
public class MathController {

    private final MathService mathService;

    public MathController(MathService mathService){
        this.mathService = mathService;
    }

    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum (@PathVariable String numberOne,
                       @PathVariable String numberTwo) {
        return this.mathService.sum(numberOne, numberTwo);
    }

    @RequestMapping("/subtraction/{numberOne}/{numberTwo}")
    public Double subtraction (@PathVariable String numberOne,
                       @PathVariable String numberTwo) {
        return this.mathService.subtraction(numberOne, numberTwo);
    }

    @RequestMapping("/multiplication/{numberOne}/{numberTwo}")
    public Double multiplication (@PathVariable String numberOne,
                       @PathVariable String numberTwo) {
        return this.mathService.multiplication(numberOne, numberTwo);
    }

    @RequestMapping("/division/{numberOne}/{numberTwo}")
    public Double division (@PathVariable String numberOne,
                       @PathVariable String numberTwo) {
        return this.mathService.division(numberOne, numberTwo);
    }

    @RequestMapping("/average/{numberOne}/{numberTwo}")
    public Double average (@PathVariable String numberOne,
                       @PathVariable String numberTwo) {
        return this.mathService.avarage(numberOne, numberTwo);
    }
    
    @RequestMapping("/sqrtRoot/{number}")
    public Double sqrtRoot (@PathVariable String number) {
        return this.mathService.sqrtRoot(number);
    }

    
}
