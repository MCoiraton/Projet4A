package fr.pet4care.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data @NoArgsConstructor @AllArgsConstructor @Getter @Setter

@Entity
public class Client {
    @Id
    private int id;
    private String nom;
    private String prenom;
    private String adresse;
    private String tel;
    private String mdp;


}
