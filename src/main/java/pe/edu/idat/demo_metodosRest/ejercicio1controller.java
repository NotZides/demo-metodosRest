package pe.edu.idat.demo_metodosRest;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class ejercicio1controller {

    private final ejercicio1service ejercicio1service;

    public ejercicio1controller(pe.edu.idat.demo_metodosRest.ejercicio1service ejercicio1service) {
        this.ejercicio1service = ejercicio1service;
    }
}
