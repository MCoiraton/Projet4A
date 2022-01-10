package fr.polytech.api.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "reservations")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private int idClient;
    private int idGardien;
    private Date dateDebut;
    private Date dateFin;
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

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = IdClient;
    }

    public String getIdGardien() {
        return idGardien;
    }

    public void setIdGardien(String idGardien) {
        this.idGardien = idGardien;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }
}
