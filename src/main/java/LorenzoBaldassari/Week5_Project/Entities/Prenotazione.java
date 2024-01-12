package LorenzoBaldassari.Week5_Project.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
@ToString
@Entity
@Table(name="prenotazione")
public class Prenotazione {

    @Id
    @GeneratedValue
    private long id;
    @Column(unique = true)
    private LocalDate dataPrenotazione;

    @ManyToOne
    @JoinColumn(name="id_utente")
    private Utente utente;

    @ManyToOne
    @JoinColumn(name="id_postazione")
    private Postazione postazione;


    public Prenotazione(LocalDate dataPrenotazione, Utente utente, Postazione postazione) {
        this.dataPrenotazione = dataPrenotazione;
        this.utente = utente;
        this.postazione = postazione;
    }

    public void setDataPrenotazione(LocalDate dataPrenotazione) {
        this.dataPrenotazione = dataPrenotazione;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }
}
