package PaoloOliviero.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table (name = "evento")
public class Evento {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column (name = "titolo", nullable = false)
    private String titolo;
    @Column (name = "dataEvento", nullable = false)
    private Date dataEvento;
    @Column (name = "descrizione", nullable = false)
    private String descrizione;
    @Column (name = "tipoEvento", nullable = false)
    private TipoEvento tipoEvento;
    @Column (name = "titolo", nullable = false)
    private int numeroMassimoPartecipanti;


    public Evento (Long id, String titolo, Date dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti
    ) {
        this.titolo = titolo;
        this.dataEvento = dataEvento;
        this.descrizione = descrizione;
        this.tipoEvento = tipoEvento;
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Date getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(Date dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", dataEvento=" + dataEvento +
                ", descrizione='" + descrizione + '\'' +
                '}';
    }
}
