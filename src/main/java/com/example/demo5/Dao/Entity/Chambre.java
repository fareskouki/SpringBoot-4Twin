package com.example.demo5.Dao.Entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Setter
@Table(name="Chambre")
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idchambre;

    @Column(name="numeroChambre",unique = true)
    private long numchambre;

    public long getIdchambre() {
        return idchambre;
    }

    public void setIdchambre(long idchambre) {
        this.idchambre = idchambre;
    }

    public long getNumchambre() {
        return numchambre;
    }

    public void setNumchambre(long numchambre) {
        this.numchambre = numchambre;
    }

    public TypeChambre getTypeChambre() {
        return typeChambre;
    }

    public void setTypeChambre(TypeChambre typeChambre) {
        this.typeChambre = typeChambre;
    }

    public Set<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(Set<Reservation> reservations) {
        this.reservations = reservations;
    }

    public Bloc getBloc() {
        return bloc;
    }

    public void setBloc(Bloc bloc) {
        this.bloc = bloc;
    }

    @Enumerated(EnumType.STRING)
    private TypeChambre typeChambre;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservations;
    @ManyToOne
    private Bloc bloc;
}