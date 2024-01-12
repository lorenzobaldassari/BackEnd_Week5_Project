package LorenzoBaldassari.Week5_Project.Dao;

import LorenzoBaldassari.Week5_Project.Entities.Postazione;
import LorenzoBaldassari.Week5_Project.Entities.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface PrenotazioneDao extends JpaRepository<Prenotazione,Long> {

    @Query("SELECT u FROM Prenotazione u WHERE u.postazione=2653aa1e-6431-4d6b-ad73-adc8a724d18f")
    List<Prenotazione> prenotazioniInDataINdicata();
//    List<Prenotazione> prenotazioniInDataINdicata(@Param("data")LocalDate data);
//    @Query(value="SELECT u FROM Prenotazione u WHERE u.id =:id",nativeQuery = true)
//    Optional<Prenotazione> findByIDD(@Param("id")long id);
}
