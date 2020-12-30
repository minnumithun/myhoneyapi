package com.mvm.myhoneyapi.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/calculator")
public class CalculatorController {

    @GetMapping("/add/{val1}/{val2}")
    public int add(@PathVariable("val1") int val1, @PathVariable("val2") int val2){
        return val1 + val2;
    }

    @GetMapping("/multi/{val1}/{val2}")
    public int multiplication(@PathVariable int val1, @PathVariable int val2){
        return val1 * val2;
    }

    @GetMapping("/sub")
    public int substraction(@RequestParam("val1") int val1, @RequestParam("val2") int val2){
        return val1 - val2;
    }

    @GetMapping("/div")
    public int dividon(@RequestParam("val1") int val1, @RequestParam("val2") int val2){
        return val1 / val2;
    }
}
