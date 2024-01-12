package LorenzoBaldassari.Week5_Project.Dao;

import LorenzoBaldassari.Week5_Project.Entities.Edificio;
import LorenzoBaldassari.Week5_Project.Entities.Postazione;
import LorenzoBaldassari.Week5_Project.Entities.Prenotazione;
import LorenzoBaldassari.Week5_Project.Exceptions.ItemNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("application.properties")
public class PrenotazioneService {

    @Autowired
    PrenotazioneDao prenotazioneDao;

    public void save(Prenotazione item){
        prenotazioneDao.save(item);
        System.out.println("elemento "+ item.getId()+" con id "+item.getId()+" salvato correttamente");
    }

    public Prenotazione findById(long id) throws ItemNotFoundException {
        return prenotazioneDao.findById(id).orElseThrow(()->new ItemNotFoundException(id));
    }
}
