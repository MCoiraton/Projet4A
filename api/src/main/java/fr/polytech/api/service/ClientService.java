package fr.polytech.api.service;

import fr.polytech.api.entity.Client;
import fr.polytech.api.model.JwtResponse;
import fr.polytech.api.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@Transactional
public class ClientService implements UserDetailsService {
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

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        try{
            Client client = getClientByMail(username);
            return new User(client.getMail(),
                client.getHash(),
                new ArrayList<>());
        }catch (NoSuchElementException e){
            throw new UsernameNotFoundException("User not found with mail: " + username);
        }
    }
}
