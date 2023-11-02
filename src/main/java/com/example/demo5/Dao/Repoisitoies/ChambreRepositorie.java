package com.example.demo5.Dao.Repoisitoies;

import com.example.demo5.Dao.Entity.Bloc;
import com.example.demo5.Dao.Entity.Chambre;
import com.example.demo5.Dao.Entity.TypeChambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChambreRepositorie extends JpaRepository<Chambre,Long> {
  Chambre findByNumchambreAndTypeChambre(Long num, TypeChambre type);
  Chambre findByNumchambre(long numchambre);
  List<Chambre> findByTypeChambre(TypeChambre typeChambre);
  List<Chambre> findByBlocIdbloc(long blocId);
  List<Chambre> findByBlocIdblocAndTypeChambre(long blocId, TypeChambre typeChambre);
  Chambre findByNumchambreAndTypeChambre(long numchambre, TypeChambre typeChambre);

}
