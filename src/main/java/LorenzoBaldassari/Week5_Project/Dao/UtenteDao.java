package LorenzoBaldassari.Week5_Project.Dao;

import LorenzoBaldassari.Week5_Project.Entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtenteDao extends JpaRepository<Utente,Long> {
}
