package com.example.agifyapi.controller;

import com.example.agifyapi.model.AgifyResponse;
import com.example.agifyapi.service.AgifyService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

@RestController
@RequestMapping("/api")
public class AgifyController {

    private final AgifyService agifyService;

    public AgifyController(AgifyService agifyService) {
        this.agifyService = agifyService;
    }

    @GetMapping(value = "/edad", produces = MediaType.APPLICATION_JSON_VALUE)
    public AgifyResponse getEdadPorNombre(@RequestParam String nombre) {
        return agifyService.getEstimatedAge(nombre);
    }

}
