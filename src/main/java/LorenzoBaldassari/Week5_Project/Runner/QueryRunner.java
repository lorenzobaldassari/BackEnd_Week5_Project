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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;


@Component
public class QueryRunner implements CommandLineRunner {
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


//        ------------query ricerca per tipoPostazione--------------

//        List<Postazione> lista= postazioneService.filterByTipoPostazione(TipoPostazione.OPENSPACE);
//        System.out.println("con OPENSPACE ci sono");
//        lista.forEach(elem->System.out.println(elem));

        //        ------------query ricerca per citta--------------

//        List<Postazione> lista2=postazioneService.filterByCitta("milano");
//        System.out.println("a milano ci sono");
//        lista2.forEach(elem->System.out.println(elem));


//        ---------query per controllare se una data e disponibile-----------

//        IL CONTROLLO E FATTO DIRETTAMENTE SUL SALVATAGGIO
//        ESEMPIO se inseriamo una data gia presa
//        ATTENZIONE uuid e id sono da prendere dal db perche veongono generati, quelli presenti
//        sono placeholder

//        Postazione postFromDb= postazioneService.findByUUID("686c8a7a-c8fd-4635-a072-c08224165321");
//        Utente utenteFromDb=utenteService.findById(1);
//        Prenotazione prenot4= new Prenotazione(LocalDate.now(),utenteFromDb,postFromDb);
//        prenotazioneService.save(prenot4);


    }







}
