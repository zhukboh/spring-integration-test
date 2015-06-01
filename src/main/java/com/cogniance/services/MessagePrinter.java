package com.cogniance.services;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Service;

@Service
public class MessagePrinter {

    @ServiceActivator(inputChannel = "sampleChannel")
    public void printResponse(String response){
        System.out.println(response);
    }

}
