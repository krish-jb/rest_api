package com.example.rest_api.services.impl;

import com.example.rest_api.services.GreenPrinter;
import org.springframework.stereotype.Component;

public class SpanishGreenPrinter implements GreenPrinter {

    @Override
    public String print() {
        return "Verde";
    }
}
