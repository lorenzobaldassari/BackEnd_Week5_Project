package LorenzoBaldassari.Week5_Project.Dao;


import LorenzoBaldassari.Week5_Project.Entities.Postazione;
import LorenzoBaldassari.Week5_Project.Entities.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface PrenotazioneDao extends JpaRepository<Prenotazione,Long> {

   ;

    List<Prenotazione> findByDataPrenotazione(LocalDate data);

}
