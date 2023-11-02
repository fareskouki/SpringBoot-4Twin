package com.example.demo5.Services;

import com.example.demo5.Dao.Entity.Bloc;
import com.example.demo5.Dao.Entity.Foyer;

import java.util.List;

public interface IBlocService {
    Bloc addBlock(Bloc c);
    List<Bloc> addBlocs(List<Bloc> blocs);
    Bloc editBloc(Bloc b);
    List<Bloc> findAll();
    Bloc findById(long Id);
    void deleteById(long Id);
    void delete(Bloc b);
    List<Bloc> findByNomBloc(String nomBloc);
    List<Bloc> findByCapaciteBloc(long capaciteBloc);
    List<Bloc> findByNomBlocAndCapaciteBloc(String nomBloc, long capaciteBloc);
    List<Bloc> findByNomBlocIgnoreCase(String nomBloc);
    List<Bloc> findByCapaciteBlocGreaterThan(long capacite); // Ajoutez cette méthode
    List<Bloc> findByNomBlocContaining(String sousChaine); // Ajoutez cette méthode
    List<Bloc> findAllByOrderByNombloc();
    List<Bloc> findByNomblocOrCapacitebloc(String nomBloc, long capaciteBloc);
    List<Bloc> findByUniversiteAndFoyer(String nomUniversite);

}
