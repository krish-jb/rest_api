package com.example.rest_api.services.impl;

import com.example.rest_api.services.RedPrinter;
import org.springframework.stereotype.Service;

@Service
public class SpanishRedPrinter implements RedPrinter {

    @Override
    public String print() {
        return "Rojo";
    }
}
