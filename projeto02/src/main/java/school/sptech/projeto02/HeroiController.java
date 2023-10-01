package school.sptech.projeto02;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HeroiController {

    private List<SuperHeroi> heroisInteressante = new ArrayList<>();

    @GetMapping("/heroi-favorito")
    public SuperHeroi favorito() {
        SuperHeroi heroi = new SuperHeroi("AA", "Super A", 800.0, false);
        return heroi;
    }

    @GetMapping("/herois-fortes")
    public List<SuperHeroi> fortes() {
        var lista = List.of(new SuperHeroi("AA", "SA", 1200.0, false),
                new SuperHeroi("BB", "SB", 1800.0, true)
        );
        return lista;
    }

    @GetMapping("/novo-interessante/{nomeVerdadeiro}/{nomeHeroi}/{forca}/{voar}")
    public String heroisInteressantes(@PathVariable String nomeVerdadeiro,
                                                @PathVariable String nomeHeroi,
                                                @PathVariable Double forca,
                                                @PathVariable Boolean voar) {
        SuperHeroi superHeroi = new SuperHeroi(nomeVerdadeiro, nomeHeroi, forca, voar);

        if (superHeroi.getNomeVerdadeiro() != null ||
        superHeroi.getNomeHeroi() != null ||
        superHeroi.getForca() != null ||
        superHeroi.getVoa() != null) {
            heroisInteressante.add(superHeroi);
            return "Cadastro efetuado com sucesso!";
        } else {
            return "Cadastro invalido!";
        }
    }

    @GetMapping("/herois-interessantes")
    public List<SuperHeroi> heroisInteressantesLista() {
        return heroisInteressante;
    }


}
