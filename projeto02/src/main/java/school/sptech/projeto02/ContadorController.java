package school.sptech.projeto02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contador")
public class ContadorController {

    private int contador = 0;

    @GetMapping("/contar")
    public String contador() {
        contador++;
        return "Você já me chamou %d vezes".formatted(contador);
    }

}
