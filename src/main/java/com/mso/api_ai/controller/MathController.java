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
    
}
