package LorenzoBaldassari.Week5_Project.Dao;

import LorenzoBaldassari.Week5_Project.Entities.Prenotazione;
import LorenzoBaldassari.Week5_Project.Entities.Utente;
import LorenzoBaldassari.Week5_Project.Exceptions.ItemNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@PropertySource("application.properties")
@Transactional
public class UtenteService {

    @Autowired
    UtenteDao utenteDao;

    public void save(Utente item){
        utenteDao.save(item);
        System.out.println("elemento "+ item.getNome()+" con id "+item.getId()+" salvato correttamente");
    }

    public Utente findById(long id) throws ItemNotFoundException {
        return utenteDao.findById(id).orElseThrow(()->new ItemNotFoundException(id));
    }
}
