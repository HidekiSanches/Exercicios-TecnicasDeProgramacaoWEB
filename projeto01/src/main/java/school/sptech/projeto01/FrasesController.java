package school.sptech.projeto01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrasesController {

    @GetMapping("/cumprimentar")
    public String cumprimentar() {
        return "Sejam bem vindos e minha sempática API!";
    }

    @GetMapping("/boa-noite")
    public String boaNoite() {
        return "Tenham uma boa noite!";
    }

}
