package br.com.fiap.study_apir.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class PingController {

    @GetMapping("ping")
    public String ping() {
        return "POOOOONG"; // Resposta padrão
    }

    @GetMapping("rota1")
    public String rotal() {
        return "rotal"; // Resposta padrão
    }

    @GetMapping("enzo")
    public String enzo() {
        return "WAKAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAOOOOOOOOOOOOOOOOOOO"; // Resposta padrão
    }

    @GetMapping("wth")
    public String wth() {
        return "whatahelps??"; // Resposta padrão
    }

}
