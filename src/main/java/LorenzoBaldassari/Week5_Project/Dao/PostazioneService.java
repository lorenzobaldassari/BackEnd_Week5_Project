package LorenzoBaldassari.Week5_Project.Dao;


import LorenzoBaldassari.Week5_Project.Entities.Enum.TipoPostazione;
import LorenzoBaldassari.Week5_Project.Entities.Postazione;
import LorenzoBaldassari.Week5_Project.Entities.Prenotazione;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PostazioneService {

    @Autowired
    PostazioneDao postazioneDao;

    public void save(Postazione item){
        postazioneDao.save(item);
        System.out.println("elemento "+ item.getTipoPostazione()+" con id "+item.getCodiceUnivoco()+" salvato correttamente");
    }

    public List<Postazione> filterByTipoPostazione(TipoPostazione tipo){
        List<Postazione> lista= postazioneDao.findByTipoPostazione(tipo);
        if(lista.size()==0){System.out.println("non ci sono elementi di questo tipo");}
        return lista;
    }
    public List<Postazione> filterByCitta(String nome){
      List<Postazione> list=  postazioneDao.findByCitta(nome);

      if(list.size()==0){
          System.out.println("non ci sono elementi a "+nome);
      }
      return list;
    }

    public Postazione findByUUID(String uuid1){
        UUID uuid= UUID.fromString(uuid1);
        return postazioneDao.findByCodiceUnivoco(uuid).orElseThrow(()->new RuntimeException());

    }


}
