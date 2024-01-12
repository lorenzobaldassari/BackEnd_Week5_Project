package LorenzoBaldassari.Week5_Project.Dao;

import LorenzoBaldassari.Week5_Project.Entities.Enum.TipoPostazione;
import LorenzoBaldassari.Week5_Project.Entities.Postazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PostazioneDao extends JpaRepository<Postazione,UUID> {

//    List<Postazione> FindByDescrizione(String descrizione);
    List<Postazione> findByCodiceUnivoco(UUID codice);
}
