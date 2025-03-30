package com.example.rest_api.services.impl;

import com.example.rest_api.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishRedPrinter implements RedPrinter {

    @Override
    public String print() {
        return "Red";
    }
}
