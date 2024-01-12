package LorenzoBaldassari.Week5_Project.Entities;

import LorenzoBaldassari.Week5_Project.Entities.Enum.TipoPostazione;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@NoArgsConstructor
@Entity
@Table(name="postazione")
public class Postazione {
    @Id
    @UuidGenerator
    private UUID codiceUnivoco;

    private String descrizione;

    @Enumerated(EnumType.STRING)
    private TipoPostazione tipoPostazione;

    private int numeroMaxOccupanti;

    @OneToOne
    @JoinColumn(name = "id_edificio")
    private Edificio edificio;

    @OneToMany(mappedBy = "postazione")
    private List<Prenotazione> listaPrenotazioni= new ArrayList<>();

    public Postazione(String descrizione, TipoPostazione tipoPostazione, int numeroMaxOccupanti, Edificio edificio) {
        this.descrizione = descrizione;
        this.tipoPostazione = tipoPostazione;
        this.numeroMaxOccupanti = numeroMaxOccupanti;
        this.edificio = edificio;
    }

    public Postazione(String descrizione, TipoPostazione tipoPostazione, int numeroMaxOccupanti, Edificio edificio, List<Prenotazione> listaPrenotazioni) {
        this.descrizione = descrizione;
        this.tipoPostazione = tipoPostazione;
        this.numeroMaxOccupanti = numeroMaxOccupanti;
        this.edificio = edificio;
        this.listaPrenotazioni = listaPrenotazioni;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setTipoPostazione(TipoPostazione tipoPostazione) {
        this.tipoPostazione = tipoPostazione;
    }

    public void setNumeroMaxPrenotazioni(int numeroMaxOccupanti) {
        this.numeroMaxOccupanti = numeroMaxOccupanti;
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


    @Override
    public String toString() {
        return "Postazione{" +
                "codiceUnivoco=" + codiceUnivoco +
                ", descrizione='" + descrizione + '\'' +
                ", tipoPostazione=" + tipoPostazione +
                ", numeroMaxOccupanti=" + numeroMaxOccupanti +
                ", edificio=" + edificio +
                '}';
    }
}
