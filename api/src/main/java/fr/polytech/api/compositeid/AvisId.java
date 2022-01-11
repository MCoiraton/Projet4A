package fr.polytech.api.compositeid;

import java.io.Serializable;
import java.util.Objects;

public class AvisId implements Serializable {
    private int idGardien;
    private int idAuteur;

    public AvisId() {
    }

    public AvisId(int idGardien, int idAuteur) {
        this.idGardien = idGardien;
        this.idAuteur = idAuteur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AvisId avisId = (AvisId) o;
        return idGardien == avisId.idGardien && idAuteur == avisId.idAuteur;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idGardien, idAuteur);
    }
}
