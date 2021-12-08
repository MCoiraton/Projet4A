package fr.pet4care.dao;

import fr.pet4care.entities.Gardien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface GardienInterface extends JpaRepository<Gardien, Integer> {
    public List<Gardien> findByNom(String nom);
    public List<Gardien> findById (int id);
    public List<Gardien> findByAdresse(String adresse);
    public List<Gardien> findByTel(String tel);
    public List<Gardien> findByStatus(boolean status);
    public List<Gardien> findTopByNom(String nom);
}
