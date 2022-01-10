package fr.polytech.api.service;

import fr.polytech.api.entity.Client;
import fr.polytech.api.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@Transactional
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public List<Client> listAllClient(){
        return clientRepository.findAll();
    }

    public Client getClient(Integer id){
        return clientRepository.findById(id).get();
    }

    public Client getClientByMail(String mail){
        List <Client> clients = clientRepository.findByMail(mail);
        if (clients.size() != 1)
            throw new NoSuchElementException("Pas de client avec cette adresse email");
        return clients.get(0);
    }

    public void saveClient(Client client){
        clientRepository.save(client);
    }
}
