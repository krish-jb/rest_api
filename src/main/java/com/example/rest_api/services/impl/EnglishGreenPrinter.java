package com.example.rest_api.services.impl;

import com.example.rest_api.services.GreenPrinter;

public class EnglishGreenPrinter implements GreenPrinter {

    @Override
    public String print() {
        return "Green";
    }
}
