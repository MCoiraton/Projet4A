package fr.polytech.api.repository;

import fr.polytech.api.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {

    List<Animal> findByProprietaire(int idPropretaire);
}
