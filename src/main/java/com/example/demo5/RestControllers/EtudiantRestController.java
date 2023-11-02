package com.example.demo5.RestControllers;

import com.example.demo5.Dao.Entity.Etudiant;
import com.example.demo5.Services.IEtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Controller
@AllArgsConstructor
@RestController
@RequestMapping("etudiant")
public class EtudiantRestController {
    IEtudiantService iEtudiantService;

    @GetMapping("findAll")
    List<Etudiant> findAll(){
        return iEtudiantService.findAll();
    }
    @PostMapping("Etudiant")
    Etudiant addEtudiant(@RequestBody Etudiant b){
        return iEtudiantService.addEtudiant(b);
    }
    @PutMapping("editEtudiant")
    Etudiant editEtudiant(@RequestBody Etudiant c){
        return iEtudiantService.editEtudiant(c);
    }
    @GetMapping("findById")
    Etudiant findById(@RequestParam long d){
        return iEtudiantService.findById(d);
    }
    @DeleteMapping("deleteById")
    public void deleteById(@RequestParam long e){
        iEtudiantService.deleteById(e);
    }
    @DeleteMapping("delete")
    public void delete(@RequestParam Etudiant f){
        iEtudiantService.delete(f);
    }
    @PostMapping("addEtudiant")
    List<Etudiant> addEtudiant(@RequestBody List<Etudiant> etudiants) {
        return iEtudiantService.addEtudiant(etudiants);
    }
    @GetMapping("/byNomPrenom")
    public List<Etudiant> findEtudiantByNomPrenom(
            @RequestParam("nom") String nom,
            @RequestParam("prenom") String prenom) {
        return iEtudiantService.findByNomEtAndPrenomEt(nom, prenom);
    }

    @GetMapping("/byCin")
    public List<Etudiant> findEtudiantByCin(@RequestParam("cin") long cin) {
        return iEtudiantService.findByCin(cin);
    }

    @GetMapping("/byDateNaissance")
    public List<Etudiant> findEtudiantByDateNaissance(
            @RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        return iEtudiantService.findByDateNaissanceAfter(date);
    }

    @GetMapping("/byEcole")
    public List<Etudiant> findEtudiantByEcole(@RequestParam("ecole") String ecole) {
        return iEtudiantService.findByEcole(ecole);
    }

    @GetMapping("/byReservationId")
    public List<Etudiant> findEtudiantByReservationId(@RequestParam("idReservation") String idReservation) {
        return iEtudiantService.findByReservationId(idReservation);
    }


    @GetMapping("/byEcoleAndDateNaissance")
    public List<Etudiant> findEtudiantByEcoleAndDateNaissance(
            @RequestParam("ecole") String ecole,
            @RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        return iEtudiantService.findByEcoleAndDateNaissanceAfter(ecole, date);
    }

}
