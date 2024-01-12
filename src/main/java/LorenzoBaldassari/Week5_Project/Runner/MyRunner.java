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

        Utente a= new Utente("aa","aa","aa");
        Edificio b= new Edificio("pub","milano","milano");
        Postazione c = new Postazione("ss", TipoPostazione.OPENSPACE,20,b);
        Prenotazione p= new Prenotazione(LocalDate.now(),a,c);

		utenteService.save(a);
		edificioService.save(b);
		postazioneService.save(c);
		prenotazioneService.save(p);
    }
}
