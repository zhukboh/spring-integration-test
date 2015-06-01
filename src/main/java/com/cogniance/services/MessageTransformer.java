package com.cogniance.services;

import org.springframework.integration.annotation.Transformer;
import org.springframework.stereotype.Component;

@Component
public class MessageTransformer {

    @Transformer(inputChannel = "sampleChannel", outputChannel = "printChannel")
    public String appendHello(String response) {
        return "Hello\n" + response;
    }

}
