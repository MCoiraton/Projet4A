package fr.polytech.api.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private String nom_client;
    private String nom_gardien;
    private Date date_debut;
    private Date date_fin;
    private String commentaire;

    public Reservation() {}

    public Reservation(int id, String nom_client, String nom_gardien, Date date_debut, Date date_fin, String commentaire) {
        this.id = id;
        this.nom_client = nom_client;
        this.nom_gardien = nom_gardien;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.commentaire = commentaire;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_client() {
        return nom_client;
    }

    public void setNom_client(String nom_client) {
        this.nom_client = nom_client;
    }

    public String getNom_gardien() {
        return nom_gardien;
    }

    public void setNom_gardien(String nom_gardien) {
        this.nom_gardien = nom_gardien;
    }

    public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }
}
