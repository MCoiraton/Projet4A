package fr.polytech.api.service;

import fr.polytech.api.compositeid.AvisId;
import fr.polytech.api.entity.Avis;
import fr.polytech.api.repository.AvisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@Transactional
public class AvisService {
    @Autowired
    private AvisRepository avisRepository;

    public List<Avis> listAllAvis(){
        return avisRepository.findAll();
    }

    public Avis getAvis(AvisId id){
        return avisRepository.findById(id).get();
    }

    public List<Avis> getAvisByIdGardien(int id){
        List <Avis> avis = avisRepository.findByIdGardien(id);
        if(avis.size() <1)
            throw new NoSuchElementException("Pas encore d'avis pour ce gardien !");
        return avis;
    }

    public void saveAvis(Avis avis){
        avisRepository.save(avis);
    }
}
