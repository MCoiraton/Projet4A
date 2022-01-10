package fr.polytech.api.repository;

import fr.polytech.api.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Integer> {
    List<Client> findByMail(String mail);
    List<Client> findByEstGardien(boolean estGardien);
}
