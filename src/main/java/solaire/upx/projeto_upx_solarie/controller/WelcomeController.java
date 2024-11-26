package solaire.upx.projeto_upx_solarie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping
    public String helloWorld(){
        return "API para o projeto Solaire";
    }
}