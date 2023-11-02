package com.example.demo5.Services;

import com.example.demo5.Dao.Entity.Foyer;

import java.util.List;

public interface IFoyerService {
    Foyer addFoyer(Foyer c);
    List<Foyer> addFoyer(List<Foyer> foyers);
    Foyer editFoyer(Foyer b);
    List<Foyer> findAll();
    Foyer findById(long Id);
    void deleteById(long Id);
    void delete(Foyer b);

}
