package com.example.agifyapi.service;

import com.example.agifyapi.model.AgifyResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AgifyService {

    private final RestTemplate restTemplate = new RestTemplate();

    public AgifyResponse getEstimatedAge(String name) {
        String url = "https://api.agify.io/?name=" + name;
        return restTemplate.getForObject(url, AgifyResponse.class);
    }
}
