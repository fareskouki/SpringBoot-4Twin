package RestControllers;

import Entity.Bloc;
import Services.IBlocService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor

public class BlocRestController {
    IBlocService iBlocService;

    @GetMapping("findAllBloc")
    List<Bloc> findAll(){
        return iBlocService.findAll();
    }
    @PostMapping("/addBloc")
    Bloc addBloc(@RequestBody Bloc b){
        return iBlocService.addBlock(b);
    }
    @PutMapping("editBloc")
    Bloc editBloc(@RequestBody Bloc c){
        return iBlocService.editBloc(c);
    }
    @GetMapping("findById")
    Bloc findById(@RequestParam long Id){
        return iBlocService.findById(Id);
    }
    @DeleteMapping ("deleteById/{Id}")
    public void deleteById(@PathVariable long Id){
        iBlocService.deleteById(Id);
    }
    @DeleteMapping("deleteBloc")
    public void deleteBloc(@PathVariable Bloc e){
        iBlocService.delete(e);
    }
    @PostMapping("addBlocs")
    List<Bloc> addBlocs(@RequestBody List<Bloc> blocs) {
        return iBlocService.addBlocs(blocs);
    }
    @GetMapping("/byNombloc")
    public List<Bloc> findBlocByNombloc(@RequestParam("nombloc") String nombloc) {
        return iBlocService.findByNomBloc(nombloc);
    }

    @GetMapping("/byCapacitebloc")
    public List<Bloc> findBlocByCapacitebloc(@RequestParam("capacitebloc") long capacitebloc) {
        return iBlocService.findByCapaciteBloc(capacitebloc);
    }

    @GetMapping("/byNomblocAndCapacitebloc")
    public List<Bloc> findBlocByNomblocAndCapacitebloc(
            @RequestParam("nomBloc") String nomBloc,
            @RequestParam("capaciteBloc") long capaciteBloc
    ) {
        return iBlocService.findByNomBlocAndCapaciteBloc(nomBloc, capaciteBloc);
    }

    @GetMapping("/byNomblocIgnoreCase")
    public List<Bloc> findBlocByNomblocIgnoreCase(@RequestParam("nomBloc") String nomBloc) {
        return iBlocService.findByNomBlocIgnoreCase(nomBloc);
    }

    @GetMapping("/byCapaciteBlocGreaterThan")
    public List<Bloc> findBlocByCapaciteBlocGreaterThan(@RequestParam("capacite") long capacite) {
        return iBlocService.findByCapaciteBlocGreaterThan(capacite);
    }

    @GetMapping("/byNomblocContaining")
    public List<Bloc> findBlocByNomblocContaining(@RequestParam("sousChaine") String sousChaine) {
        return iBlocService.findByNomBlocContaining(sousChaine);
    }

    @GetMapping("/orderByNombloc")
    public List<Bloc> findAllBlocOrderByNombloc() {
        return iBlocService.findAllByOrderByNombloc();
    }

    @GetMapping("/byNomblocOrCapacitebloc")
    public List<Bloc> findBlocByNomblocOrCapacitebloc(
            @RequestParam("nomBloc") String nomBloc,
            @RequestParam("capaciteBloc") long capaciteBloc
    ) {
        return iBlocService.findByNomblocOrCapacitebloc(nomBloc, capaciteBloc);
    }



    @GetMapping("/byUniversiteAndFoyer")
    public List<Bloc> findBlocByUniversiteAndFoyer(@RequestParam("nomUniversite") String nomUniversite) {
        return iBlocService.findByUniversiteAndFoyer(nomUniversite);
    }
}
