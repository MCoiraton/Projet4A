package fr.pet4care.dao;


import fr.pet4care.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ClientInterface extends JpaRepository<Client, Integer> {
    public List<Client> findByNom(String nom);
    public List<Client> findById (int id);
    public List<Client> findByAdresse(String adresse);
    public List<Client> findByTel(String tel);
}
