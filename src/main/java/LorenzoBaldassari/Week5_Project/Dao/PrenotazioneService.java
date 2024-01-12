package LorenzoBaldassari.Week5_Project.Dao;

import LorenzoBaldassari.Week5_Project.Entities.Edificio;
import LorenzoBaldassari.Week5_Project.Entities.Postazione;
import LorenzoBaldassari.Week5_Project.Entities.Prenotazione;
import LorenzoBaldassari.Week5_Project.Exceptions.ItemNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@PropertySource("application.properties")
public class PrenotazioneService {

    @Autowired
    PrenotazioneDao prenotazioneDao;

    public void save(Prenotazione item){
        LocalDate data = item.getDataPrenotazione();
        prenotazioneDao.save(item);
        System.out.println("elemento "+ item.getId()+" con id "+item.getId()+" salvato correttamente");
    }

    public Prenotazione findById(long id) throws ItemNotFoundException {
        return prenotazioneDao.findById(id).orElseThrow(()->new ItemNotFoundException(id));
    }

    public void findByddate(){
        List<Prenotazione> list1= prenotazioneDao.prenotazioniInDataINdicata();
        System.out.println(list1);
    }
}
