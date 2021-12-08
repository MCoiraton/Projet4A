package fr.pet4care.entities;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data @NoArgsConstructor @AllArgsConstructor @Getter @Setter

@Entity
public class Avis {
    @Id
    private String nom_com;
    private String contenu;
    private int note;
}
