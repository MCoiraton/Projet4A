package fr.pet4care.dao;

import fr.pet4care.entities.Avis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface AvisInterface extends JpaRepository<Avis, Integer> {
    public List<Avis> findByNote(int note);
}
