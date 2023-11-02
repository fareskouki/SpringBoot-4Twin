package com.example.demo5.Dao.Repoisitoies;

import com.example.demo5.Dao.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespositorie extends JpaRepository<User,Long> {
}
