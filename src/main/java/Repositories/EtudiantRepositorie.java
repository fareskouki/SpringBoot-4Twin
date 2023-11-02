package Repositories;

import Entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface EtudiantRepositorie extends JpaRepository<Etudiant,Long> {
    List<Etudiant> findByNomEtAndPrenomEt(String nomEt, String prenomEt);
    List<Etudiant> findByCin(long cin);
    List<Etudiant> findByDateNaissanceEAfter(LocalDate date);
    List<Etudiant> findByEcole(String ecole);
    List<Etudiant> findByReservationIdReservation(String idReservation);
    List<Etudiant> findByEcoleAndDateNaissanceEAfter(String ecole, LocalDate date);

}
