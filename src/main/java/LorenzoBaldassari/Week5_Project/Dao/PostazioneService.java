package LorenzoBaldassari.Week5_Project.Dao;

import LorenzoBaldassari.Week5_Project.Entities.Postazione;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("application.properties")
public class PostazioneService {

    @Autowired
    PostazioneDao postazioneDao;

    public void save(Postazione item){
        postazioneDao.save(item);
        System.out.println("elemento "+ item.getTipoPostazione()+" con id "+item.getCodiceUnivoco()+" salvato correttamente");
    }

}
