package Services;

import Entity.Bloc;
import Repositories.BlocRepositorie;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class BlocService implements IBlocService {

    BlocRepositorie blocRepositorie;
    @Override
    public Bloc addBlock(Bloc c) {
        return blocRepositorie.save(c);
    }
    @Override
    public List<Bloc> addBlocs(List<Bloc> blocs) {
        return blocRepositorie.saveAll(blocs);
    }
    @Override
    public Bloc editBloc(Bloc b) {
        return blocRepositorie.save(b);//pour faire la modification
    }

    @Override
    public List<Bloc> findAll() {
        return blocRepositorie.findAll();
    }

    @Override
    public  Bloc findById(long Id) {
        return blocRepositorie.findById(Id).get();
       // return blocRepositorie.findById(Id).orElse(Bloc.builder().build());
    }
    @Override
    public void deleteById(long Id) {
        blocRepositorie.deleteById(Id);
    }
    @Override
    public void delete(Bloc b) {
        blocRepositorie.delete(b);

    }
    @Override
    public List<Bloc> findByNomBloc(String nomBloc) {
        return blocRepositorie.findByNombloc(nomBloc);
    }
    @Override
    public List<Bloc> findByCapaciteBloc(long capaciteBloc) {
        return blocRepositorie.findByCapacitebloc(capaciteBloc);
    }
    @Override
    public List<Bloc> findByNomBlocAndCapaciteBloc(String nomBloc, long capaciteBloc) {
        return blocRepositorie.findByNomblocAndCapacitebloc(nomBloc, capaciteBloc);
    }
    @Override
    public List<Bloc> findByNomBlocIgnoreCase(String nomBloc) {
        return blocRepositorie.findByNomblocIgnoreCase(nomBloc);
    }
    @Override
    public List<Bloc> findByCapaciteBlocGreaterThan(long capacite) {
        return blocRepositorie.findByCapaciteblocGreaterThan(capacite);
    }
    @Override
    public List<Bloc> findByNomBlocContaining(String sousChaine) {
        return blocRepositorie.findByNomblocContaining(sousChaine);
    }
    @Override
    public List<Bloc> findAllByOrderByNombloc() {
        return blocRepositorie.findAllByOrderByNombloc();
    }
    @Override
    public List<Bloc> findByNomblocOrCapacitebloc(String nomBloc, long capaciteBloc) {
        return blocRepositorie.findByNomblocOrCapacitebloc(nomBloc, capaciteBloc);
    }

    @Override
    public List<Bloc> findByUniversiteAndFoyer(String nomUniversite) {
        return blocRepositorie.findByUniversiteAndFoyer(nomUniversite);
    }
}
