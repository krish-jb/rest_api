package com.example.rest_api.services.impl;

import com.example.rest_api.services.GreenPrinter;
import org.springframework.stereotype.Service;

@Service
public class SpanishGreenPrinter implements GreenPrinter {

    @Override
    public String print() {
        return "Verde";
    }
}
