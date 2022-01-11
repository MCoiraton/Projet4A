package fr.polytech.api.controller;

import fr.polytech.api.entity.Animal;
import fr.polytech.api.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/animals")
public class AnimalController {
    @Autowired
    AnimalService animalService;

    @GetMapping("")
    public List<Animal> list(){
        return animalService.listAllAnimal();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Animal> get(@PathVariable Integer id){
        try{
            Animal animal = animalService.getAnimal(id);
            return new ResponseEntity<Animal>(animal, HttpStatus.OK);
        }catch (NoSuchElementException e){
            return new ResponseEntity<Animal>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/proprio/{idProprietaire}")
    public ResponseEntity<List<Animal>> getByProprietaire(@PathVariable Integer idProprietaire){
        try {
            List<Animal> animals=animalService.getAnimalsByProprietaire(idProprietaire);
            return new ResponseEntity<List<Animal>>(animals, HttpStatus.OK);
        }catch (NoSuchElementException e){
            return new ResponseEntity<List<Animal>>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public void add(@RequestBody Animal animal){
        animalService.saveAnimal(animal);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Animal animal, @PathVariable Integer id){
        try{
            Animal existAnimal = animalService.getAnimal(id);
            animal.setId(id);
            animalService.saveAnimal(animal);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (NoSuchElementException e){
            return new ResponseEntity<Animal>(HttpStatus.NOT_FOUND);
        }
    }


}