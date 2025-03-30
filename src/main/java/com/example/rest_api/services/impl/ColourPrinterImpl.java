package com.example.rest_api.services.impl;

import com.example.rest_api.services.BluePrinter;
import com.example.rest_api.services.ColourPrinter;
import com.example.rest_api.services.GreenPrinter;
import com.example.rest_api.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class ColourPrinterImpl implements ColourPrinter {

    private RedPrinter redPrinter;
    private BluePrinter bluePrinter;
    private GreenPrinter greenPrinter;

    public ColourPrinterImpl(
        RedPrinter redPrinter,
        BluePrinter bluePrinter,
        GreenPrinter greenPrinter
    ) {
        this.redPrinter = redPrinter;
        this.bluePrinter = bluePrinter;
        this.greenPrinter = greenPrinter;
    }

    @Override
    public String print() {
        return String.join(
            ", ",
            redPrinter.print(),
            bluePrinter.print(),
            greenPrinter.print()
        );
    }
}
