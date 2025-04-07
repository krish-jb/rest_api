package com.example.rest_api.services.impl;

import com.example.rest_api.services.BluePrinter;
import org.springframework.stereotype.Service;

@Service
public class EnglishBluePrinter implements BluePrinter {

    @Override
    public String print() {
        return "Blue";
    }
}
