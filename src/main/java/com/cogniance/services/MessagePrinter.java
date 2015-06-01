package com.cogniance.services;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {

    @ServiceActivator(inputChannel = "printChannel")
    public void printResponse(String response) {
        System.out.println(response);
    }

}
