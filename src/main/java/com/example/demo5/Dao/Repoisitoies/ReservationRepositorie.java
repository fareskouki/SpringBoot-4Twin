package com.example.demo5.Dao.Repoisitoies;

import com.example.demo5.Dao.Entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ReservationRepositorie extends JpaRepository<Reservation,String> {
    List<Reservation> findByEstvalideIsTrue();

}
