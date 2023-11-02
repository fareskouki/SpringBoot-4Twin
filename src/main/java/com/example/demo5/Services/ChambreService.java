package com.example.demo5.Services;

import com.example.demo5.Dao.Entity.Chambre;
import com.example.demo5.Dao.Entity.Etudiant;
import com.example.demo5.Dao.Entity.TypeChambre;
import com.example.demo5.Dao.Repoisitoies.ChambreRepositorie;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ChambreService implements IChambreService {

    ChambreRepositorie chambreRepositorie;

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepositorie.save(c);
    }

    @Override
    public List<Chambre> addChambre(List<Chambre> chambres) {
        return chambreRepositorie.saveAll(chambres);
    }

    @Override
    public Chambre editChambre(Chambre b) {
        return chambreRepositorie.save(b);
    }

    @Override
    public List<Chambre> findAll() {
        return chambreRepositorie.findAll();
    }

    @Override
    public Chambre findById(long Id) {
        return chambreRepositorie.findById(Id).get();
    }

    @Override
    public void deleteById(long Id) {
        chambreRepositorie.deleteById(Id);
    }

    @Override
    public void delete(Chambre b) {
        chambreRepositorie.delete(b);
    }

    @Override
    public Chambre findByNumchambre(long numchambre) {
        return chambreRepositorie.findByNumchambre(numchambre);
    }

    @Override
    public List<Chambre> findByTypeChambre(TypeChambre typeChambre) {
        return chambreRepositorie.findByTypeChambre(typeChambre);
    }

    @Override
    public List<Chambre> findByBlocIdbloc(long blocId) {
        return chambreRepositorie.findByBlocIdbloc(blocId);
    }

    @Override
    public List<Chambre> findByBlocIdblocAndTypeChambre(long blocId, TypeChambre typeChambre) {
        return chambreRepositorie.findByBlocIdblocAndTypeChambre(blocId, typeChambre);
    }

    @Override
    public List<Chambre> findByBlocIdAndTypeChambre(long blocId, TypeChambre typeChambre) {
        return null;
    }

    @Override
    public Chambre findByNumchambreAndTypeChambre(long numchambre, TypeChambre typeChambre) {
        return chambreRepositorie.findByNumchambreAndTypeChambre(numchambre, typeChambre);
    }

}
