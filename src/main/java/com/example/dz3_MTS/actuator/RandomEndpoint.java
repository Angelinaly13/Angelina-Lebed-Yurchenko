package com.example.dz3_MTS.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
@Endpoint(id="random")
public class RandomEndpoint {
    @ReadOperation
    public String random() {
        return UUID.randomUUID().toString();
    }
}