package com.example.demo5.Dao.Repoisitoies;

import com.example.demo5.Dao.Entity.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlocRepositorie extends JpaRepository<Bloc,Long> {
    List<Bloc> findByNombloc(String nombloc);

    List<Bloc> findByCapacitebloc(long capacitebloc);
    List<Bloc> findByNomblocAndCapacitebloc(String nomBloc, long capaciteBloc);
    List<Bloc> findByNomblocIgnoreCase(String nomBloc);
    List<Bloc> findByCapaciteblocGreaterThan(long capacite);
    List<Bloc> findByNomblocContaining(String sousChaine);
    @Query("SELECT b FROM Bloc b ORDER BY b.nombloc ASC")
    List<Bloc> findAllByOrderByNombloc();
    List<Bloc> findByNomblocOrCapacitebloc(String nomBloc, long capaciteBloc);

    @Query("SELECT b FROM Bloc b JOIN b.foyer f JOIN f.universite u WHERE u.nomuniversite = :nomUniversite")
    List<Bloc> findByUniversiteAndFoyer(String nomUniversite);
}