package fr.polytech.projetvdeux.dao;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FicheAnimal {
@Id
    private int id;
    private String nom;
    private String type;
    private String desc;


    public FicheAnimal(){

}

    public FicheAnimal(int id, String nom, String type, String desc) {
        this.id = id;
        this.nom = nom;
        this.type = type;
        this.desc = desc;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "FicheAnimal{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", type='" + type + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
