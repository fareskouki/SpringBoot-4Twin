package com.example.demo5.Services;

import com.example.demo5.Dao.Entity.Reservation;

import java.util.Date;
import java.util.List;

public interface IReservationService {
    Reservation addReservation(Reservation c);
    List<Reservation> addReservation(List<Reservation> Reservations);
    Reservation editReservation(Reservation b);
    List<Reservation> findAll();
    Reservation findById(String Id);
    void deleteById(String Id);
    void delete(Reservation b);
    List<Reservation> findValidReservations();

}
