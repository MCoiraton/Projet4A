package fr.polytech.api.entity;

import fr.polytech.api.compositeid.AvisId;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "avis")
@IdClass(AvisId.class)
public class Avis {
    private int idGardien;
    private int idAuteur;
    private int note;
    private String message;

    public Avis() {
    }


    public Avis(int idGardien, int idAuteur, String message, int note) {
        this.idGardien = idGardien;
        this.idAuteur = idAuteur;
        this.note = note;
        this.message = message;
    }

    @Id
    public int getIdGardien() {
        return idGardien;
    }

    public void setIdGardien(int idGardien) {
        this.idGardien = idGardien;
    }

    @Id
    public int getIdAuteur() {
        return idAuteur;
    }

    public void setIdAuteur(int idAuteur) {
        this.idAuteur = idAuteur;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
