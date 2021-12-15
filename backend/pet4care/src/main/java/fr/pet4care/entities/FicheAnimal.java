package fr.pet4care.entities;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data @NoArgsConstructor @AllArgsConstructor @Getter @Setter

@Entity
public class FicheAnimal {

    @Id
    private int id;
    private String nom;
    private String type;
    private String description;
}
