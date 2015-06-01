package com.cogniance.gateways;

import org.springframework.integration.annotation.Gateway;

public interface HttpGateway {

    @Gateway(requestChannel = "sampleChannel")
    void placeReply(String reply);

}
