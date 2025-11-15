package com.saludo.demo.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludo {

    @GetMapping("/api/saludo/{nombre}")
    public ResponseEntity<String> saludo(@PathVariable String nombre) {
        if (nombre.length() >= 3) {
            return ResponseEntity.ok("¡Hola: " + nombre + "!");
        } else {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("Error: El nombre debe tener al menos 3 caracteres.");
        }
    }
}
