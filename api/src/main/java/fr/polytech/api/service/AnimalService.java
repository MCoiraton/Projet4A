package fr.polytech.api.service;

import fr.polytech.api.entity.Animal;
import fr.polytech.api.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@Transactional
public class AnimalService {
    @Autowired
    private AnimalRepository animalRepository;

    public List<Animal> listAllAnimal() { return  animalRepository.findAll(); }

    public  Animal getAnimal(Integer id) { return animalRepository.findById(id).get(); }

    public List <Animal> getAnimalsByProprietaire(int idProprietaire){
        List <Animal> animals = animalRepository.findByProprietaire(idProprietaire);
        if(animals.size() <1)
            throw new NoSuchElementException("Pas d'animaux avec ce proprio");
        return animals;
    }

    public void saveAnimal(Animal animal) { animalRepository.save(animal); }
}
