package fr.pet4care.entities;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data @NoArgsConstructor @AllArgsConstructor @Getter @Setter

@Entity
public class Reservation {
    @Id
    private String nom_client;
    private String nom_gardien;
    @DateTimeFormat private Date date_debut;
    private Date date_fin;
    private String commentaires;
}
