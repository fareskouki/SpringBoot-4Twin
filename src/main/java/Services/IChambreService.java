package Services;

import Entity.Chambre;
import Entity.TypeChambre;

import java.util.List;

public interface IChambreService
{
    Chambre addChambre(Chambre c);
    List<Chambre> addChambre(List<Chambre> chambres);
    Chambre editChambre(Chambre b);
    List<Chambre> findAll();
    Chambre findById(long Id);
    void deleteById(long Id);
    void delete(Chambre b);
    Chambre findByNumchambre(long numchambre);
    List<Chambre> findByTypeChambre(TypeChambre typeChambre);
    List<Chambre> findByBlocIdAndTypeChambre(long blocId, TypeChambre typeChambre);
    Chambre findByNumchambreAndTypeChambre(long numchambre, TypeChambre typeChambre);
    List<Chambre> findByBlocIdbloc(long blocId);
    List<Chambre> findByBlocIdblocAndTypeChambre(long blocId, TypeChambre typeChambre);

}
