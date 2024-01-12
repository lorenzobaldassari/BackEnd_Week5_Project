package LorenzoBaldassari.Week5_Project.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
@Entity
@Table(name="utente")
public class Utente {
    @Id
    @GeneratedValue
    private long id;

    private String username;

    private String nome;

    private String email;

    @OneToMany(mappedBy = "utente")
    private List<Prenotazione> listaDiPrenotazioni= new ArrayList<>();

    public Utente(String username, String nome, String email) {
        this.username = username;
        this.nome = nome;
        this.email = email;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setListaDiPrenotazioni(List<Prenotazione> listaDiPrenotazioni) {
        this.listaDiPrenotazioni = listaDiPrenotazioni;
    }
    public void addPrenotazione(Prenotazione prenotazioni) {
        this.listaDiPrenotazioni.add(prenotazioni);
    }

    @Override
    public String toString() {
        return "Utente{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
