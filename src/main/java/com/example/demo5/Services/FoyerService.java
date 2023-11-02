package com.example.demo5.Services;

import com.example.demo5.Dao.Entity.Foyer;
import com.example.demo5.Dao.Repoisitoies.FoyerRepositorie;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@NoArgsConstructor
public class FoyerService implements IFoyerService{

    FoyerRepositorie foyerRepositorie;
    @Override
    public Foyer addFoyer(Foyer c) {
        return foyerRepositorie.save(c);
    }

    @Override
    public List<Foyer> addFoyer(List<Foyer> foyers) {
        return foyerRepositorie.saveAll(foyers);
    }

    @Override
    public Foyer editFoyer(Foyer b) {
        return foyerRepositorie.save(b);
    }

    @Override
    public List<Foyer> findAll() {
        return foyerRepositorie.findAll();
    }

    @Override
    public Foyer findById(long Id) {
        return foyerRepositorie.findById(Id).get();
    }

    @Override
    public void deleteById(long Id) {
        foyerRepositorie.deleteById(Id);
    }

    @Override
    public void delete(Foyer b) {
        foyerRepositorie.delete(b);
    }


}
