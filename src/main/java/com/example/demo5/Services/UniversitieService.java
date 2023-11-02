package com.example.demo5.Services;

import com.example.demo5.Dao.Entity.Universite;

import com.example.demo5.Dao.Repoisitoies.UniversiteRepositorie;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@NoArgsConstructor
public class UniversitieService implements IUnivertieService {

    UniversiteRepositorie universiteRepositorie;
    @Override
    public Universite addUniversite(Universite c) {
        return universiteRepositorie.save(c);
    }

    @Override
    public List<Universite> addUniversite(List<Universite> Universites) {
        return universiteRepositorie.saveAll(Universites);
    }

    @Override
    public Universite editUniversite(Universite b) {
        return universiteRepositorie.save(b);
    }

    @Override
    public List<Universite> findAll() {
        return universiteRepositorie.findAll();
    }

    @Override
    public Universite findById(Long Id) {
        return universiteRepositorie.findById(Id).get();
    }

    @Override
    public void deleteById(Long Id) {
        universiteRepositorie.deleteById(Id);
    }

    @Override
    public void delete(Universite b) {
        universiteRepositorie.delete(b);
    }
}
