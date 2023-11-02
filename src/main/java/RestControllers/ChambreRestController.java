package RestControllers;

import Entity.Chambre;
import Entity.TypeChambre;
import Services.IChambreService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@AllArgsConstructor
@RestController

public class ChambreRestController {
    IChambreService iChambreService;

    @GetMapping("findAlChambre")
    List<Chambre> findAll(){
        return iChambreService.findAll();
    }
    @PostMapping("Chambreadd")
    Chambre addChambre(@RequestBody Chambre b){
        return iChambreService.addChambre(b);
    }
    @PutMapping("editChambre")
    Chambre editChambre(@RequestBody Chambre c){
        return iChambreService.editChambre(c);
    }
    @GetMapping("findByIdChambre")
    Chambre findById(@RequestParam long d){
        return iChambreService.findById(d);
    }
    @DeleteMapping("deleteByIdChambre")
    public void deleteById(@RequestParam long e){
        iChambreService.deleteById(e);
    }
    @DeleteMapping("deleteChambre")
    public void delete(@RequestParam Chambre f){
        iChambreService.delete(f);
    }
    @PostMapping("addChambre")
    List<Chambre> addChambre(@RequestBody List<Chambre> chambres) {
        return iChambreService.addChambre(chambres);
    }
    @GetMapping("/chambreByNum/{numchambre}")
    Chambre findChambreByNum(@PathVariable long numchambre) {
        return iChambreService.findByNumchambre(numchambre);
    }
    @GetMapping("/chambresByType/{typeChambre}")
    List<Chambre> findChambresByType(@PathVariable TypeChambre typeChambre) {
        return iChambreService.findByTypeChambre(typeChambre);
    }
    @GetMapping("/byBlocId")
    public List<Chambre> findChambreByBlocId(@RequestParam("blocId") long blocId) {
        return iChambreService.findByBlocIdbloc(blocId);
    }

    @GetMapping("/byBlocIdAndTypeChambre")
    public List<Chambre> findChambreByBlocIdAndTypeChambre(
            @RequestParam("blocId") long blocId,
            @RequestParam("typeChambre") TypeChambre typeChambre
    ) {
        return iChambreService.findByBlocIdblocAndTypeChambre(blocId, typeChambre);
    }

    @GetMapping("/chambresByBlocAndType/{blocId}/{typeChambre}")
    List<Chambre> findChambresByBlocAndType(@PathVariable long blocId, @PathVariable TypeChambre typeChambre) {
        return iChambreService.findByBlocIdAndTypeChambre(blocId, typeChambre);
    }
    @GetMapping("/chambreByNumAndType/{numchambre}/{typeChambre}")
    Chambre findChambreByNumAndType(@PathVariable long numchambre, @PathVariable TypeChambre typeChambre) {
        return iChambreService.findByNumchambreAndTypeChambre(numchambre, typeChambre);
    }

}
