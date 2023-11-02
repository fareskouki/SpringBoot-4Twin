package Services;

import Entity.Reservation;
import Repositories.ReservationRepositorie;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@NoArgsConstructor
public class ReservationService implements IReservationService{
ReservationRepositorie ReservationRepositorie;
    @Override
    public Reservation addReservation(Reservation c) {
        return ReservationRepositorie.save(c);
    }

    @Override
    public List<Reservation> addReservation(List<Reservation> Reservations) {
        return ReservationRepositorie.saveAll(Reservations);
    }

    @Override
    public Reservation editReservation(Reservation b) {
        return ReservationRepositorie.save(b);
    }

    @Override
    public List<Reservation> findAll() {
        return ReservationRepositorie.findAll();
    }

    @Override
    public Reservation findById(String Id) {
        return ReservationRepositorie.findById(Id).get();
    }

    @Override
    public void deleteById(String Id) {
        ReservationRepositorie.deleteById(Id);
    }

    @Override
    public void delete(Reservation b) {
        ReservationRepositorie.delete(b);
    }
    public List<Reservation> findValidReservations() {
        return ReservationRepositorie.findByEstvalideIsTrue();
    }

}
