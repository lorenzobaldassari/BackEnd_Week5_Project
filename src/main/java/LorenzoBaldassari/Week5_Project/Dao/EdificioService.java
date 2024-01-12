package LorenzoBaldassari.Week5_Project.Dao;

import LorenzoBaldassari.Week5_Project.Entities.Edificio;
import LorenzoBaldassari.Week5_Project.Exceptions.ItemNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("application.properties")
public class EdificioService {
    @Autowired
    EdificioDao edificioDao;

    public void save(Edificio item){
        edificioDao.save(item);
        System.out.println("elemento "+ item.getCitta()+" con id "+item.getId()+" salvato correttamente");
    }

    public Edificio findById(long id) throws ItemNotFoundException{
        return edificioDao.findById(id).orElseThrow(()->new ItemNotFoundException(id));
    }
}
