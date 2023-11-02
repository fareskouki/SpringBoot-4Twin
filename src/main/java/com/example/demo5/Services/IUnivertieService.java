package com.example.demo5.Services;

import com.example.demo5.Dao.Entity.Universite;

import java.util.List;

public interface IUnivertieService {
    Universite addUniversite(Universite c);
    List<Universite> addUniversite(List<Universite> Universites);
    Universite editUniversite(Universite b);
    List<Universite> findAll();
    Universite findById(Long Id);
    void deleteById(Long Id);
    void delete(Universite b);
}
