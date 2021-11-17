package fr.polytech.projetvdeux.dao;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Reservation {
    @Id
    private String nom_client;
    private String nom_gardien;
    private Date date_debut;
    private Date date_fin;
    private String commentaires;

    public Reservation(){

    }

    public Reservation(String nom_client, String nom_gardien, Date date_debut, Date date_fin, String commentaires) {
        this.nom_client = nom_client;
        this.nom_gardien = nom_gardien;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.commentaires = commentaires;
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

    public String getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(String commentaires) {
        this.commentaires = commentaires;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "nom_client='" + nom_client + '\'' +
                ", nom_gardien='" + nom_gardien + '\'' +
                ", date_debut=" + date_debut +
                ", date_fin=" + date_fin +
                ", commentaires='" + commentaires + '\'' +
                '}';
    }
}
