package fr.polytech.projetvdeux.dao;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Gardien extends Client {
    @Id
    private String list_avis;
    private boolean status;
    private String list_disponible;

    public Gardien() {

    }

    public Gardien(int id, String nom, String prenom, String adresse, String tel, String mdp, String list_avis, boolean status, String list_disponible) {
        super(id, nom, prenom, adresse, tel, mdp);
        this.list_avis = list_avis;
        this.status = status;
        this.list_disponible = list_disponible;
    }

    public String getList_avis() {
        return list_avis;
    }

    public void setList_avis(String list_avis) {
        this.list_avis = list_avis;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getList_disponible() {
        return list_disponible;
    }

    public void setList_disponible(String list_disponible) {
        this.list_disponible = list_disponible;
    }

    @Override
    public String toString() {
        return "Gardien{" +
                "list_avis='" + list_avis + '\'' +
                ", status=" + status +
                ", list_disponible='" + list_disponible + '\'' +
                '}';
    }
}
