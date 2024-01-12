package LorenzoBaldassari.Week5_Project.Dao;

import LorenzoBaldassari.Week5_Project.Entities.Enum.TipoPostazione;
import LorenzoBaldassari.Week5_Project.Entities.Postazione;
import LorenzoBaldassari.Week5_Project.Exceptions.ItemNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@PropertySource("application.properties")
public class PostazioneService {

    @Autowired
    PostazioneDao postazioneDao;

    public void save(Postazione item){
        postazioneDao.save(item);
        System.out.println("elemento "+ item.getTipoPostazione()+" con id "+item.getCodiceUnivoco()+" salvato correttamente");
    }

//    public List<Postazione> findByDescrizione(String streing){
//        List<Postazione> lista= postazioneDao.FindByDescrizione(streing);
//        if(lista.size()==0){System.out.println("non ci sono elementi di questo tipo");}
//        return lista;
//    }
public List<Postazione> findByCodice (String codice)  {
    UUID uuid=UUID.fromString(codice);
    return postazioneDao.findByCodiceUnivoco(uuid);
}


}
