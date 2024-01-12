package LorenzoBaldassari.Week5_Project.Entities;
import LorenzoBaldassari.Week5_Project.Entities.Enum.TipoPostazione;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.UuidGenerator;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@ToString
@NoArgsConstructor
@Table(name = "edificio")
public class Edificio {
    @Id
    @GeneratedValue
    private long id;

    private String nome;
    private String indirizzo;
    private String citta;

    @OneToOne(mappedBy = "edificio")
    private Postazione postazione;

    public Edificio(String nome, String indirizzo, String citta, Postazione postazione) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.citta = citta;
        this.postazione = postazione;
    }

    public Edificio(String nome, String indirizzo, String citta) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.citta = citta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public void setPostazione(Postazione postazione) {
        this.postazione = postazione;
    }
}
