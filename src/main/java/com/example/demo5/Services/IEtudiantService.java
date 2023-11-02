package com.example.demo5.Services;

import com.example.demo5.Dao.Entity.Etudiant;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

public interface IEtudiantService {
    Etudiant addEtudiant(Etudiant c);
    List<Etudiant> addEtudiant(List<Etudiant> Etudiant);
    Etudiant editEtudiant(Etudiant b);
    List<Etudiant> findAll();
    Etudiant findById(long Id);
    void deleteById(long Id);
    void delete(Etudiant b);
    List<Etudiant> findByNomEtAndPrenomEt(String nomEt, String prenomEt);
    List<Etudiant> findByCin(long cin);
    List<Etudiant> findByDateNaissanceAfter(@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date);
    List<Etudiant> findByEcole(String ecole);
    List<Etudiant> findByReservationId(String idReservation);
    List<Etudiant> findByEcoleAndDateNaissanceAfter(String ecole, @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date);

}
