package LorenzoBaldassari.Week5_Project.Entities;

import LorenzoBaldassari.Week5_Project.Entities.Enum.TipoPostazione;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Getter
@NoArgsConstructor
@ToString
@Entity
@Table(name="postazione")
public class Postazione {
    @Id
    @UuidGenerator
    private UUID codiceUnivoco;

    private String descrizione;

    @Enumerated(EnumType.STRING)
    private TipoPostazione tipoPostazione;

    private int numeroMaxPrenotazioni;

    @OneToOne
    @JoinColumn(name = "id_edificio")
    private Edificio edificio;

    @OneToMany(mappedBy = "postazione")
    private List<Prenotazione> listaPrenotazioni;

    public Postazione(String descrizione, TipoPostazione tipoPostazione, int numeroMaxPrenotazioni, Edificio edificio) {
        this.descrizione = descrizione;
        this.tipoPostazione = tipoPostazione;
        this.numeroMaxPrenotazioni = numeroMaxPrenotazioni;
        this.edificio = edificio;
    }

    public Postazione(String descrizione, TipoPostazione tipoPostazione, int numeroMaxPrenotazioni, Edificio edificio, List<Prenotazione> listaPrenotazioni) {
        this.descrizione = descrizione;
        this.tipoPostazione = tipoPostazione;
        this.numeroMaxPrenotazioni = numeroMaxPrenotazioni;
        this.edificio = edificio;
        this.listaPrenotazioni = listaPrenotazioni;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setTipoPostazione(TipoPostazione tipoPostazione) {
        this.tipoPostazione = tipoPostazione;
    }

    public void setNumeroMaxPrenotazioni(int numeroMaxPrenotazioni) {
        this.numeroMaxPrenotazioni = numeroMaxPrenotazioni;
    }

    public void setEdificio(Edificio edificio) {
        this.edificio = edificio;
    }

    public void setListaPrenotazioni(List<Prenotazione> listaPrenotazioni) {
        this.listaPrenotazioni = listaPrenotazioni;
    }
    public void addPrenotazione(Prenotazione prenotazioni) {
        this.listaPrenotazioni.add(prenotazioni);
    }

}
