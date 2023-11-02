package Repositories;

import Entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservationRepositorie extends JpaRepository<Reservation,String> {
    List<Reservation> findByEstvalideIsTrue();

}
