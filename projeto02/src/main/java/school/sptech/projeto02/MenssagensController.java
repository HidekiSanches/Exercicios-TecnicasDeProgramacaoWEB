package school.sptech.projeto02;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/menssagem")
public class MenssagensController {

    @GetMapping("/bem-vindo/{pessoa}")
    public String darBoasVindas(@PathVariable String pessoa) {
        return "Bem-Vindo(a) a minha simpática API, %s".formatted(pessoa);
    }

    @GetMapping("/comidas-favoritas/{salgado}/{doce}")
    public String comidasFavoritas(@PathVariable String salgado,
                                   @PathVariable String doce) {
        return "Sua comida salgada favorita é %s e a doce é %s".formatted(salgado, doce);
    }

    /*
        votar?nome=joao&idade=25
    */

    @GetMapping("/votar")
    public boolean votar(@RequestParam String nome,
                         @RequestParam int idade) {
        System.out.println("Verificando votação p/ %s".formatted(nome));
        return idade >= 16;
    }

    @GetMapping("/potencia/{n1}/{n2}")
    public Integer potencia(@PathVariable Double n1,
                           @PathVariable Double n2) {
        return (int)Math.pow(n1,n2);
    }

    @GetMapping("/calcular")
    public String calcular(@RequestParam String operacao,
                            @RequestParam int n1,
                            @RequestParam int n2) {
        if (operacao.equals("subtracao")){
            var result = n1 - n2;
            return "O resultado de %d - %d é igual a %d".formatted(n1, n2, result);
        } else if (operacao.equals("soma")){
            var result = n1 + n2;
            return "O resultado de %d + %d é igual a %d".formatted(n1, n2, result);
        } else {
            return "Operação invalida";
        }
    }

}
