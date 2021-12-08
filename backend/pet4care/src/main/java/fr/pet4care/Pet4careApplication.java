package fr.pet4care;

import fr.pet4care.dao.ClientInterface;
import fr.pet4care.entities.Client;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Pet4careApplication {

    public static void main(String[] args) { SpringApplication.run(Pet4careApplication.class, args);}

        @Bean
        CommandLineRunner runner(ClientInterface clientInterface){
            return args->{
               clientInterface.save(new Client(1,"Jean","Pierre","12 rue JP","0000","bite"));
            };
        }

}
