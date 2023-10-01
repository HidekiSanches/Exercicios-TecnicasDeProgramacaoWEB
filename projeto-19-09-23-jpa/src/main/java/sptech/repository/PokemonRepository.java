package sptech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sptech.domain.Pokemon;

public interface PokemonRepository extends JpaRepository<Pokemon, Integer>{
}
