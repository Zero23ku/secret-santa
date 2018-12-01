package cl.zero23ku.secretsanta.controllers;

import cl.zero23ku.secretsanta.services.MailSenderService;
import cl.zero23ku.secretsanta.services.SecretSantaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping("/")
    public String mainPage(Model model){
        model.addAttribute("test","ayyyyyy");
        return "home";
    }
}
