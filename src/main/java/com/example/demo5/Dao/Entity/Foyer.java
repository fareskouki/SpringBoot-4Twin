package com.example.demo5.Dao.Entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="Foyer")
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idfoyer;

    public long getIdfoyer() {
        return idfoyer;
    }

    public void setIdfoyer(long idfoyer) {
        this.idfoyer = idfoyer;
    }

    public String getNomfoyer() {
        return nomfoyer;
    }

    public void setNomfoyer(String nomfoyer) {
        this.nomfoyer = nomfoyer;
    }

    public long getCapacitefoyer() {
        return capacitefoyer;
    }

    public void setCapacitefoyer(long capacitefoyer) {
        this.capacitefoyer = capacitefoyer;
    }

    public Universite getUniversite() {
        return universite;
    }

    public void setUniversite(Universite universite) {
        this.universite = universite;
    }

    public Set<Bloc> getBlocs() {
        return blocs;
    }

    public void setBlocs(Set<Bloc> blocs) {
        this.blocs = blocs;
    }

    @Column(name="nomfoyer")
    private String nomfoyer;

    @Column(name="capaciteFoyer")
    private long capacitefoyer;
    @OneToOne(mappedBy = "foyer")//eli fih mapped by howa child
    private Universite universite;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "foyer")
    private Set<Bloc> blocs;

}
