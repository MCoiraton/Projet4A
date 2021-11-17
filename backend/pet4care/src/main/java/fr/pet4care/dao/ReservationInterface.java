package fr.polytech.projetvdeux.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationInterface extends JpaRepository<Reservation, Integer> {
}
