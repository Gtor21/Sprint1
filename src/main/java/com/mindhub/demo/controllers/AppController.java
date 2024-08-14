package com.mindhub.demo.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@Tag(name = "App Controller", description = "API que dice hola")
public class AppController {

    /*
    Endpoint = URL, PATH, RUTA
    Metodos HTTP(POST, GET, PUT PATCH, DELETE)
    Formato Json = RESPONSE, REQUEST
    Logica
    HTTP STATUS
     */

    @Operation(summary = "dice Hello", description = "Returns un simple hola! message")
    @GetMapping
    public ResponseEntity<String> saludar(){
        //return new ResponseEntity<>("Hola", HttpStatus.ok);
        return ResponseEntity.ok("Hola soy api de gabriel");
    }


    @PostMapping
    public ResponseEntity<?> multiplicar(@RequestParam Double num) {
        if ( num > 0 ) {
            Double result = num * 2;
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body("El Numero no puede ser menor o igual a 0");
    }

}
