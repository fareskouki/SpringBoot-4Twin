package com.example.demo5.Dao.Entity;


import jakarta.persistence.*;

@Entity
@Table(name="universite")
public class Universite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUniversite;
    @Column(name="nomuniversité")
    private String nomuniversite;
    @Column(name="adresse")
    private String adresse;
    @OneToOne(cascade = CascadeType.ALL)//cascade pour ajouter et foyer en meme temps + affectation cascade fil parent
    private Foyer foyer;
    public long getIdUniversite() {
        return idUniversite;
    }
    public void setIdUniversite(long idUniversite) {
        this.idUniversite = idUniversite;
    }
    public String getNomuniversite() {
        return nomuniversite;
    }
    public void setNomuniversite(String nomuniversite) {
        this.nomuniversite = nomuniversite;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public Foyer getFoyer() {
        return foyer;
    }
    public void setFoyer(Foyer foyer) {
        this.foyer = foyer;
    }
}