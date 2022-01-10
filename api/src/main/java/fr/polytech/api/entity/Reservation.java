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

    public Reservation(int id, int idClient, int idGardien, Date dateDebut, Date dateFin, String commentaire) {
        this.id = id;
        this.idClient = idClient;
        this.idGardien = idGardien;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.commentaire = commentaire;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = IdClient;
    }

    public int getIdGardien() {
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
