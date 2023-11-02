package Entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name="reservation")
public class Reservation {
    @Id

    private String idReservation;

    public String getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(String idReservation) {
        this.idReservation = idReservation;
    }

    public Date getAnneeUniversitaire() {
        return anneeUniversitaire;
    }

    public void setAnneeUniversitaire(Date anneeUniversitaire) {
        this.anneeUniversitaire = anneeUniversitaire;
    }

    public Boolean getEstvalide() {
        return estvalide;
    }

    public void setEstvalide(Boolean estvalide) {
        this.estvalide = estvalide;
    }

    public Set<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(Set<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    @Temporal(TemporalType.DATE) //yyyy-MM-JJ HH:mm:ss
    private Date anneeUniversitaire; //lezem tkoun date util


    @Column(name="estvalide")
    private Boolean estvalide;

    @ManyToMany(mappedBy="reservation", cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;
}