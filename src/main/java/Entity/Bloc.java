package Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="bloc")
public class Bloc {
    public long getIdbloc() {
        return idbloc;
    }

    public void setIdbloc(long idbloc) {
        this.idbloc = idbloc;
    }

    public String getNombloc() {
        return nombloc;
    }

    public void setNombloc(String nombloc) {
        this.nombloc = nombloc;
    }

    public long getCapacitebloc() {
        return capacitebloc;
    }

    public void setCapacitebloc(long capacitebloc) {
        this.capacitebloc = capacitebloc;
    }

    public Foyer getFoyer() {
        return foyer;
    }

    public void setFoyer(Foyer foyer) {
        this.foyer = foyer;
    }

    public Set<Chambre> getChambres() {
        return chambres;
    }

    public void setChambres(Set<Chambre> chambres) {
        this.chambres = chambres;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idbloc;

    @Column(name="nombloc")
    private String nombloc;

    @Column(name="capacitebloc")
    private long capacitebloc;
    @ManyToOne
    @JoinColumn(name = "idfoyer")
    private Foyer foyer;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "bloc")
    private Set<Chambre> chambres;

}