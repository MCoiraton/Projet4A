package fr.pet4care.dao;

import fr.pet4care.entities.FicheAnimal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface FicheAnimalInterface extends JpaRepository<FicheAnimal, Integer> {
    public List<FicheAnimal> findById(int id);
    public List<FicheAnimal> findByNom(String nom);
    public List<FicheAnimal> findByType(String type);
}
