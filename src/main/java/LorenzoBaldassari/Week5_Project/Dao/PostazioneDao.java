package LorenzoBaldassari.Week5_Project.Dao;

import LorenzoBaldassari.Week5_Project.Entities.Enum.TipoPostazione;
import LorenzoBaldassari.Week5_Project.Entities.Postazione;
import LorenzoBaldassari.Week5_Project.Entities.Prenotazione;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface PostazioneDao extends JpaRepository<Postazione,UUID> {

    List<Postazione> findByTipoPostazione(TipoPostazione tipo);
    @Query("SELECT u FROM Postazione u JOIN u.edificio e WHERE e.citta=:nome")
    List<Postazione> findByCitta(@Param("nome") String nome);

    Optional<Postazione> findByCodiceUnivoco(UUID uuid);


}
