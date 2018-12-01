package cl.zero23ku.secretsanta.controllers;

import cl.zero23ku.secretsanta.domain.Person;
import cl.zero23ku.secretsanta.services.SecretSantaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SecretSantaController {

    SecretSantaService secretSantaService;

    SecretSantaController(SecretSantaService secretSantaService){
        this.secretSantaService = secretSantaService;
    }

    @PostMapping("/secret-santa")
    public void secretSantaInitializer(List<Person> participants){
        this.secretSantaService.createDerangements(participants);
    }
}
