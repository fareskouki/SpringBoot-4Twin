package com.example.demo5.Services;

import com.example.demo5.Dao.Entity.Etudiant;
import com.example.demo5.Dao.Repoisitoies.EtudiantRepositorie;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantService implements IEtudiantService{
    EtudiantRepositorie etudiantRepositorie;

    public Etudiant addEtudiant(Etudiant c) {
        return etudiantRepositorie.save(c);
    }

    @Override
    public List<Etudiant> addEtudiant(List<Etudiant> etudiants) {
        return etudiantRepositorie.saveAll(etudiants);
    }

    @Override
    public Etudiant editEtudiant(Etudiant b) {
        return etudiantRepositorie.save(b);
    }

    @Override
    public List<Etudiant> findAll() {
        return etudiantRepositorie.findAll();
    }

    @Override
    public Etudiant findById(long Id) {
        return etudiantRepositorie.findById(Id).get();
    }

    @Override
    public void deleteById(long Id) {
    etudiantRepositorie.deleteById(Id);
    }

    @Override
    public void delete(Etudiant b) {
    etudiantRepositorie.delete(b);
    }
    @Override
    public List<Etudiant> findByNomEtAndPrenomEt(String nomEt, String prenomEt) {
        return etudiantRepositorie.findByNomEtAndPrenomEt(nomEt, prenomEt);
    }

    @Override
    public List<Etudiant> findByCin(long cin) {
        return etudiantRepositorie.findByCin(cin);
    }

    @Override
    public List<Etudiant> findByDateNaissanceAfter(@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        return etudiantRepositorie.findByDateNaissanceEAfter(date);
    }

    @Override
    public List<Etudiant> findByEcole(String ecole) {
        return etudiantRepositorie.findByEcole(ecole);
    }

    @Override
    public List<Etudiant> findByReservationId(String idReservation) {
        return etudiantRepositorie.findByReservationIdReservation(idReservation);
    }



    @Override
    public List<Etudiant> findByEcoleAndDateNaissanceAfter(String ecole, @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        return etudiantRepositorie.findByEcoleAndDateNaissanceEAfter(ecole, date);
    }


}
