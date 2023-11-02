package RestControllers;

import Entity.Reservation;
import Services.IReservationService;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@NoArgsConstructor
@RequestMapping("reservation")

public class ReservationRestController {
    IReservationService iReservationService;
    @GetMapping("findAll")
    List<Reservation> findAll(){
        return iReservationService.findAll();
    }
    @PostMapping("Etudiant")
    Reservation addReservation(@RequestBody Reservation b){
        return iReservationService.addReservation(b);
    }
    @PutMapping("editReservation")
    Reservation editReservation(@RequestBody Reservation c){
        return iReservationService.editReservation(c);
    }
    @GetMapping("findById")
    Reservation findById(@RequestParam String d){
        return iReservationService.findById(d);
    }
    @DeleteMapping("deleteById")
    public void deleteById(@RequestParam String e){
        iReservationService.deleteById(e);
    }
    @DeleteMapping("delete")
    public void delete(@RequestParam Reservation f){
        iReservationService.delete(f);
    }
    @PostMapping("addReservation")
    List<Reservation> addReservation(@RequestBody List<Reservation> Reservations) {
        return iReservationService.addReservation(Reservations);
    }
    @GetMapping("/valid")
    public List<Reservation> findValidReservations() {
        return iReservationService.findValidReservations();
    }

}
