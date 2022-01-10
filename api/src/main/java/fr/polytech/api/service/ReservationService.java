package fr.polytech.api.service;


import fr.polytech.api.entity.Reservation;
import fr.polytech.api.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;

    public List<Reservation> listALlReservation(){ return reservationRepository.findAll();}

    public Reservation getReservation(Integer id){return reservationRepository.findById(id).get();}

    public void saveReservation(Reservation reservation) { reservationRepository.save(reservation); }
}
