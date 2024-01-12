package LorenzoBaldassari.Week5_Project.Runner;

import LorenzoBaldassari.Week5_Project.Dao.EdificioService;
import LorenzoBaldassari.Week5_Project.Dao.PostazioneService;
import LorenzoBaldassari.Week5_Project.Dao.PrenotazioneService;
import LorenzoBaldassari.Week5_Project.Dao.UtenteService;
import LorenzoBaldassari.Week5_Project.Entities.Enum.TipoPostazione;
import LorenzoBaldassari.Week5_Project.Entities.Postazione;
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
//        System.out.println(utenteService.findById(1));

//        List<Postazione> lis= postazioneService.findByDescrizione("luogo commerciale");
//        lis.forEach(elem->System.out.println(elem));
        System.out.println(edificioService.findById(1));
        System.out.println(prenotazioneService.findById(1));
//        prenotazioneService.findByddate();
       List<Postazione> lis= postazioneService.findByCodice("2653aa1e-6431-4d6b-ad73-adc8a724d18f");
       lis.forEach(elem->System.out.println(elem));



    }







}
