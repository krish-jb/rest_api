package com.example.rest_api.services.impl;

import com.example.rest_api.services.BluePrinter;
import org.springframework.stereotype.Component;

@Component
public class SpanishBluePrinter implements BluePrinter {

    @Override
    public String print() {
        return "Azul";
    }
}
