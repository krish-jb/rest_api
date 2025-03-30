package com.example.rest_api.services.impl;

import com.example.rest_api.services.BluePrinter;

public class EnglishBluePrinter implements BluePrinter {
    @Override
    public String print() {
        return "Blue";
    }
}