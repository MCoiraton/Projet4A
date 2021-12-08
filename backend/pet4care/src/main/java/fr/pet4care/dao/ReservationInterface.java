package fr.pet4care.dao;

import fr.pet4care.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Date;
import java.util.List;

@RepositoryRestResource
public interface ReservationInterface extends JpaRepository<Reservation, Integer> {
    public List<Reservation> findByNom_client(String nom_client);
    public List<Reservation> findByNom_gardien(String nom_gardien);
    public List<Reservation> findByDate_debut(Date date_debut);
    public List<Reservation> findByDate_fin(Date date_fin);
}
