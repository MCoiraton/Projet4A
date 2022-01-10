package fr.polytech.api.repository;

import fr.polytech.api.entity.Avis;
import fr.polytech.api.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
    List<Avis> findByIdGardien(int idGardien);
}
