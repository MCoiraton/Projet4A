package fr.pet4care.entities;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data @NoArgsConstructor @AllArgsConstructor @Getter @Setter

@Entity
public class Gardien extends Client {

    private String list_avis;
    private boolean status;
    private String list_disponible;
}
