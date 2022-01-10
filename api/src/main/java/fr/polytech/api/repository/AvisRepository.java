package fr.polytech.api.repository;

import fr.polytech.api.compositeid.AvisId;
import fr.polytech.api.entity.Avis;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AvisRepository extends JpaRepository<Avis, AvisId> {

    List<Avis> findByIdGardien(int idGardien);
}