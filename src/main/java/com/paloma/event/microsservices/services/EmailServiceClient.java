package com.paloma.event.microsservices.services;

import dtos.EmailRequestDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(
        name = "email-service",
        url = "http://localhost"
)
public interface EmailServiceClient {
    @PostMapping("/send")
    void sendEmail(@RequestBody EmailRequestDTO email);
}
