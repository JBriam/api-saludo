package com.saludo.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludo {

    @GetMapping("/saludo/{nombre}")
    public String saludar(@PathVariable String nombre) {
        if (nombre.length() >= 3){
            return "¡Hola, " + nombre + "!";
        } else {
            throw new IllegalArgumentException("El nombre debe tener al menos 3 caracteres.");
        }
        
    }
}
