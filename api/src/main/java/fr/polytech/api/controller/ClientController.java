package fr.polytech.api.controller;

import fr.polytech.api.entity.Client;
import fr.polytech.api.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/clients")
public class ClientController {
    @Autowired
    ClientService clientService;

    @GetMapping("")
    public List<Client> list(){
        return clientService.listAllClient();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> get(@PathVariable Integer id){
        try{
            Client client = clientService.getClient(id);
            return new ResponseEntity<Client>(client, HttpStatus.OK);
        }catch (NoSuchElementException e){
            return new ResponseEntity<Client>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/gardiens")
    public List<Client> listGardiens(){
        return clientService.getGardien();
    }

    @GetMapping("/mail/{mail}")
    public ResponseEntity<Client> getByMail(@PathVariable String mail){
        try{
            Client client = clientService.getClientByMail(mail);
            return new ResponseEntity<Client>(client, HttpStatus.OK);
        }catch (NoSuchElementException e){
            return new ResponseEntity<Client>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public void add(@RequestBody Client client){
        clientService.saveClient(client);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Client client, @PathVariable Integer id){
        try{
            Client existClient = clientService.getClient(id);
            client.setId(id);
            clientService.saveClient(client);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (NoSuchElementException e){
            return new ResponseEntity<Client>(HttpStatus.NOT_FOUND);
        }
    }

}
