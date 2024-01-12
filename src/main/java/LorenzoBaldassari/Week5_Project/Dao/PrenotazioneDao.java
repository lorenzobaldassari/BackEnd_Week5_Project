package LorenzoBaldassari.Week5_Project.Dao;

import LorenzoBaldassari.Week5_Project.Entities.Postazione;
import LorenzoBaldassari.Week5_Project.Entities.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrenotazioneDao extends JpaRepository<Prenotazione,Long> {
}
