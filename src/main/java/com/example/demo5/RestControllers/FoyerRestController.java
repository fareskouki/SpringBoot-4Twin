package com.example.demo5.RestControllers;

import com.example.demo5.Dao.Entity.Foyer;
import com.example.demo5.Dao.Entity.Foyer;

import com.example.demo5.Services.IFoyerService;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@NoArgsConstructor
@RequestMapping("foyer")

public class FoyerRestController {
    IFoyerService iFoyerService;
    @GetMapping("findAll")
    List<Foyer> findAll(){
        return iFoyerService.findAll();
    }
    @PostMapping("Etudiant")
    Foyer addFoyer(@RequestBody Foyer b){
        return iFoyerService.addFoyer(b);
    }
    @PutMapping("editFoyer")
    Foyer editFoyer(@RequestBody Foyer c){
        return iFoyerService.editFoyer(c);
    }
    @GetMapping("findById")
    Foyer findById(@RequestParam long d){
        return iFoyerService.findById(d);
    }
    @DeleteMapping("deleteById")
    public void deleteById(@RequestParam long e){
        iFoyerService.deleteById(e);
    }
    @DeleteMapping("delete")
    public void delete(@RequestParam Foyer f){
        iFoyerService.delete(f);
    }
    @PostMapping("addfoyer")
    List<Foyer> addFoyer(@RequestBody List<Foyer> foyers) {
        return iFoyerService.addFoyer(foyers);
    }


}
