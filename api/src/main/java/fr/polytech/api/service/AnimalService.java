package fr.polytech.api.service;

import fr.polytech.api.entity.Animal;
import fr.polytech.api.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AnimalService {
    @Autowired
    private AnimalRepository animalRepository;

    public List<Animal> listAllAnimal() { return  animalRepository.findAll(); }

    public  Animal getAnimal(Integer id) { return animalRepository.findById(id).get(); }

    public void saveAnimal(Animal animal) { animalRepository.save(animal); }
}
