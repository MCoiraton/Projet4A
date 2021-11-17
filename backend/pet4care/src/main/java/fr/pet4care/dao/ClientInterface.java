package fr.polytech.projetvdeux.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientInterface extends JpaRepository<Client, Integer> {
}
