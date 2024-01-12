package LorenzoBaldassari.Week5_Project.Runner;

import LorenzoBaldassari.Week5_Project.Dao.EdificioService;
import LorenzoBaldassari.Week5_Project.Dao.PostazioneService;
import LorenzoBaldassari.Week5_Project.Dao.PrenotazioneService;
import LorenzoBaldassari.Week5_Project.Dao.UtenteService;
import LorenzoBaldassari.Week5_Project.Entities.Edificio;
import LorenzoBaldassari.Week5_Project.Entities.Enum.TipoPostazione;
import LorenzoBaldassari.Week5_Project.Entities.Postazione;
import LorenzoBaldassari.Week5_Project.Entities.Prenotazione;
import LorenzoBaldassari.Week5_Project.Entities.Utente;
import LorenzoBaldassari.Week5_Project.Week5ProjectApplication;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class MyRunner implements CommandLineRunner {



    @Autowired
    UtenteService utenteService;
    @Autowired
    PrenotazioneService prenotazioneService;
    @Autowired
    PostazioneService postazioneService;
    @Autowired
    EdificioService edificioService;
    @Override
    public void run(String... args) throws Exception {
        Faker faker= new Faker();
        Edificio edificio1 = new Edificio("banca","via parma 17","milano");
        Edificio edificio2 = new Edificio("supermercato","via olmo 44","messina");
        Edificio edificio3 = new Edificio("grande casa","capanno dei pescatori","ravensthorpe");
        Postazione postazione1= new Postazione("luogo commerciale", TipoPostazione.SALA_RIUNIONI,10,edificio1);
        Postazione postazione2= new Postazione("piscina comfrot relax", TipoPostazione.OPENSPACE,150,edificio2);
        Postazione postazione3= new Postazione("luogo di ritrovo,condivisione, decisioni politiche e feste", TipoPostazione.OPENSPACE,100,edificio3);
        Utente utente1= new Utente(faker.name().username(),faker.name().firstName(),faker.internet().emailAddress());
        Utente utente2= new Utente(faker.name().username(),faker.name().firstName(),faker.internet().emailAddress());
        Prenotazione prenot1= new Prenotazione(LocalDate.now(),utente1,postazione1);
        Prenotazione prenot2= new Prenotazione(LocalDate.now().plusDays(1),utente1,postazione2);
        Prenotazione prenot3= new Prenotazione(LocalDate.now().plusDays(4),utente2,postazione3);
//        edificioService.save(edificio1);
//        edificioService.save(edificio2);
//        edificioService.save(edificio3);
//        postazioneService.save(postazione1);
//        postazioneService.save(postazione2);
//        postazioneService.save(postazione3);
//        utenteService.save(utente1);
//        utenteService.save(utente2);
//        prenotazioneService.save(prenot1);
//        prenotazioneService.save(prenot2);
//        prenotazioneService.save(prenot3);




    }
}
