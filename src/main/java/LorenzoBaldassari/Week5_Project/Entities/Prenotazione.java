package LorenzoBaldassari.Week5_Project.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
@Entity
@Table(name="prenotazione")
public class Prenotazione {

    @Id
    @GeneratedValue
    private long id;

    @Column(unique = true)
    private LocalDate dataPrenotazione;

    @ManyToOne
    @JoinColumn(name="utente")
    private Utente utente;

    @ManyToOne
    @JoinColumn(name="postazione")
    private Postazione postazione;


    public Prenotazione(LocalDate dataPrenotazione) {
        this.dataPrenotazione = dataPrenotazione;
    }

    public Prenotazione(LocalDate dataPrenotazione, Utente utente, Postazione postazione) {
        this.dataPrenotazione = dataPrenotazione;
        this.utente = utente;
        this.postazione = postazione;
    }


    public long getId() {
        return id;
    }

    public LocalDate getDataPrenotazione() {
        return dataPrenotazione;
    }

    public Utente getUtente() {
        return utente;
    }

    public Postazione getPostazione() {
        return postazione;
    }

    public Prenotazione(LocalDate dataPrenotazione, Postazione postazione) {
        this.dataPrenotazione = dataPrenotazione;
        this.postazione = postazione;
    }

    public void setDataPrenotazione(LocalDate dataPrenotazione) {
        this.dataPrenotazione = dataPrenotazione;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    @Override
    public String toString() {
        return "Prenotazione{" +
                "id=" + id +
                ", dataPrenotazione=" + dataPrenotazione +
                ", utente=" + utente +
                ", postazione=" + postazione +
                '}';
    }
}
