package LorenzoBaldassari.Week5_Project.Dao;


import LorenzoBaldassari.Week5_Project.Entities.Prenotazione;
import LorenzoBaldassari.Week5_Project.Exceptions.ItemNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PrenotazioneService {

    @Autowired
    PrenotazioneDao prenotazioneDao;

    public List<Prenotazione> findByData(LocalDate data){
        return prenotazioneDao.findByDataPrenotazione(data);
    }
    public void save(Prenotazione item){
        LocalDate data= item.getDataPrenotazione();
        List<Prenotazione> lista= this.findByData(data);
        if(lista.size()==0){
        prenotazioneDao.save(item);
        System.out.println("elemento "+ item.getId()+" con id "+item.getId()+" salvato correttamente");
        }else{
            System.out.println("mi dispiace la data e' gia stata presa");
        }
    }

    public Prenotazione filterByPostazione(long id) throws ItemNotFoundException {
        return prenotazioneDao.findById(id).orElseThrow(()->new ItemNotFoundException(id));
    }

}
