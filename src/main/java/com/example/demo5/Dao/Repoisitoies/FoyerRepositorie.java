package com.example.demo5.Dao.Repoisitoies;

import com.example.demo5.Dao.Entity.Foyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FoyerRepositorie extends JpaRepository<Foyer,Long> {

}
