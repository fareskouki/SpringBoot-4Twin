package com.example.demo5.RestControllers;

import com.example.demo5.Dao.Entity.Universite;
import com.example.demo5.Services.IUnivertieService;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@NoArgsConstructor
@RequestMapping("universite")

public class UniversiteRestController {
    IUnivertieService iUniversiteService;
    @GetMapping("findAll")
    List<Universite> findAll(){
        return iUniversiteService.findAll();
    }
    @PostMapping("Universite")
    Universite addUniversite(@RequestBody Universite b){
        return iUniversiteService.addUniversite(b);
    }
    @PutMapping("editUniversite")
    Universite editUniversite(@RequestBody Universite c){
        return iUniversiteService.editUniversite(c);
    }
    @GetMapping("findById")
    Universite findById(@RequestParam long d){
        return iUniversiteService.findById(d);
    }
    @DeleteMapping("deleteById")
    public void deleteById(@RequestParam long e){
        iUniversiteService.deleteById(e);
    }
    @DeleteMapping("delete")
    public void delete(@RequestParam Universite f){
        iUniversiteService.delete(f);
    }
    @PostMapping("AddUniversite")
    List<Universite> addUniversite(@RequestBody List<Universite> Universites) {
        return iUniversiteService.addUniversite(Universites);
    }

}
