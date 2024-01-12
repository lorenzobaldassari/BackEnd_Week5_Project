package LorenzoBaldassari.Week5_Project;

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
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class Week5ProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(Week5ProjectApplication.class, args);




	}

}
