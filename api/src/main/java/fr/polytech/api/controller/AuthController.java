package fr.polytech.api.controller;

import fr.polytech.api.config.JwtTokenUtil;
import fr.polytech.api.entity.Client;
import fr.polytech.api.model.JwtRequest;
import fr.polytech.api.model.JwtResponse;
import fr.polytech.api.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.NoSuchElementException;

@RestController
@CrossOrigin
public class AuthController {

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private ClientService clientService;

    @RequestMapping(value = "/auth", method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception {
        try{
            Client client = clientService.getClientByMail(authenticationRequest.getMail());
            if(authenticationRequest.getHash().equals(client.getHash()))
                return new ResponseEntity<JwtResponse>(
                        new JwtResponse(jwtTokenUtil.generateToken(
                                new User(client.getMail(),
                                        client.getHash(),
                                        new ArrayList<>()))), HttpStatus.OK);
        }catch (NoSuchElementException e){
            return new ResponseEntity<Client>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Client>(HttpStatus.UNAUTHORIZED);
    }
}