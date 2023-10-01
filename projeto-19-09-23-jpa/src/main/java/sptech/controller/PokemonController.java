package sptech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sptech.domain.Pokemon;
import sptech.repository.PokemonRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    @Autowired
    PokemonRepository repository;

    @GetMapping
    public List<Pokemon> get() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Pokemon> getById(@PathVariable int id) {
        return repository.findById(id);
    }

    @PostMapping
    public void post(@RequestBody Pokemon pokemon) {
        repository.save(pokemon);
    }
}
