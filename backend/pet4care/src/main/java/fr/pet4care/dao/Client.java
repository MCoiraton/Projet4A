package fr.polytech.projetvdeux.dao;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
import java.util.Vector;

@Entity
public class Client {
    @Id
    private int id;
    private String nom;
    private String prenom;
    private String adresse;
    private String tel;
    private String mdp;


    public Client() {

    }

    public Client(int id, String nom, String prenom, String adresse, String tel, String mdp) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.tel = tel;
        this.mdp = mdp;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", tel='" + tel + '\'' +
                ", mdp='" + mdp + '\'' +
                '}';
    }


}