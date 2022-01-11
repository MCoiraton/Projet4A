package fr.polytech.api.controller;

import fr.polytech.api.compositeid.AvisId;
import fr.polytech.api.entity.Avis;
import fr.polytech.api.entity.Client;
import fr.polytech.api.service.AvisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/avis")
public class AvisController {
    @Autowired
    AvisService avisService;

    @GetMapping("")
    public List<Avis> list(){
        return avisService.listAllAvis();
    }

    @GetMapping("/{id}")
    public List<Avis> list(@PathVariable Integer id){
        return avisService.getAvisByIdGardien(id);
    }

    @GetMapping("/{idGardien}/{idAuteur}")
    public ResponseEntity<Avis> get(@PathVariable int idGardien, @PathVariable int idAuteur){
        try{
            Avis avis = avisService.getAvis(new AvisId(idGardien, idAuteur));
            return new ResponseEntity<Avis>(avis, HttpStatus.OK);
        }catch (NoSuchElementException e){
            return new ResponseEntity<Avis>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("")
    public void add(@RequestBody Avis avis){
        avisService.saveAvis(avis);
    }

    @PutMapping("/{idGardien}/{idAuteur}")
    public ResponseEntity<?> update(@RequestBody Avis avis, @PathVariable int idGardien, @PathVariable int idAuteur){
        try{
            Avis existAvis = avisService.getAvis(new AvisId(idGardien, idAuteur));
            avis.setIdGardien(idGardien);
            avis.setIdAuteur(idAuteur);
            avisService.saveAvis(avis);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (NoSuchElementException e){
            return new ResponseEntity<Client>(HttpStatus.NOT_FOUND);
        }
    }
}
