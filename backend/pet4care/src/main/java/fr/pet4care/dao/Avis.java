package fr.polytech.projetvdeux.dao;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Avis {
    @Id
    private String nom_com;
    private String contenu;
    private String note;

    public Avis() {
    }

    public Avis(String nom_com, String contenu, String note) {
        this.nom_com = nom_com;
        this.contenu = contenu;
        this.note = note;
    }

    public String getNom_com() {
        return nom_com;
    }

    public void setNom_com(String nom_com) {
        this.nom_com = nom_com;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Avis{" +
                "nom_com='" + nom_com + '\'' +
                ", contenu='" + contenu + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
