package fr.polytech.api.controller;

import fr.polytech.api.entity.Reservation;
import fr.polytech.api.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/reservations")
public class ReservationController {
    @Autowired
    ReservationService reservationService;

    @GetMapping("")
    public List<Reservation> list(){
        return reservationService.listALlReservation();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Reservation> get(@PathVariable Integer id){
        try{
            Reservation reservation = reservationService.getReservation(id);
            return new ResponseEntity<Reservation>(reservation, HttpStatus.OK);
        }catch (NoSuchElementException e){
            return new ResponseEntity<Reservation>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public void add(@RequestBody Reservation reservation){
        reservationService.saveReservation(reservation);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Reservation reservation, @PathVariable Integer id){
        try{
            Reservation existReservation = reservationService.getReservation(id);
            reservation.setId(id);
            reservationService.saveReservation(reservation);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (NoSuchElementException e){
            return new ResponseEntity<Reservation>(HttpStatus.NOT_FOUND);
        }
    }
}
