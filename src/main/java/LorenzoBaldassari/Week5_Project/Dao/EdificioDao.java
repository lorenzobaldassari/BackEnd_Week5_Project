package LorenzoBaldassari.Week5_Project.Dao;

import LorenzoBaldassari.Week5_Project.Entities.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdificioDao extends JpaRepository<Edificio,Long> {
}
