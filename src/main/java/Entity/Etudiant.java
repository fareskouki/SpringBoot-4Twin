package Entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name="etudiant")
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEtudiant;

    @Column(name="nomEt")
    private String nomEt;

    @Column(name="prenomEt")
    private String prenomEt;

    @Column(name="cin")
    private long cin;

    public long getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(long idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public String getNomEt() {
        return nomEt;
    }

    public void setNomEt(String nomEt) {
        this.nomEt = nomEt;
    }

    public String getPrenomEt() {
        return prenomEt;
    }

    public void setPrenomEt(String prenomEt) {
        this.prenomEt = prenomEt;
    }

    public long getCin() {
        return cin;
    }

    public void setCin(long cin) {
        this.cin = cin;
    }

    public String getEcole() {
        return ecole;
    }

    public void setEcole(String ecole) {
        this.ecole = ecole;
    }

    public LocalDate getDateNaissanceE() {
        return dateNaissanceE;
    }

    public void setDateNaissanceE(LocalDate dateNaissanceE) {
        this.dateNaissanceE = dateNaissanceE;
    }

    public Set<Reservation> getReservation() {
        return reservation;
    }

    public void setReservation(Set<Reservation> reservation) {
        this.reservation = reservation;
    }

    @Column(name="ecole")
    private String ecole;

    private LocalDate dateNaissanceE;  //JJ/MM/YYYY
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservation;
}