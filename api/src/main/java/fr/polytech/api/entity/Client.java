package fr.polytech.api.entity;

import javax.persistence.*;

@Entity
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String mail;
    private String nom;
    private String prenom;
    private String adresse;
    private String tel;
    private String hash;
    private boolean estGardien;

    public Client(){}

    public Client(int id, String mail, String nom, String prenom, String adresse, String tel, String hash, boolean estGardien) {
        this.id = id;
        this.mail = mail;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.tel = tel;
        this.hash = hash;
        this.estGardien = estGardien;
    }


    public int getId(){
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public boolean isEstGardien() {
        return estGardien;
    }

    public void setEstGardien(boolean estGardien) {
        this.estGardien = estGardien;
    }
}
