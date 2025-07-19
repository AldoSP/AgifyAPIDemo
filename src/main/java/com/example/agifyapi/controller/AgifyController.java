package com.example.agifyapi.controller;

import com.example.agifyapi.model.AgifyResponse;
import com.example.agifyapi.service.AgifyService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/api")
public class AgifyController {

    private final AgifyService agifyService;

    public AgifyController(AgifyService agifyService) {
        this.agifyService = agifyService;
    }

    @GetMapping(value = "/edad", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Object> getEdadPorNombre(
            @RequestParam String nombre,
            @RequestParam(required = false) Integer edadReal) {

        AgifyResponse respuesta = agifyService.getEstimatedAge(nombre);

        Map<String, Object> resultado = new HashMap<>();
        resultado.put("name", respuesta.getName());
        resultado.put("estimatedAge", respuesta.getAge());
        resultado.put("count", respuesta.getCount());

        if (edadReal != null) {
            resultado.put("realAge", edadReal);
            resultado.put("match", edadReal.equals(respuesta.getAge()));
        }

        return resultado;
    }

}
