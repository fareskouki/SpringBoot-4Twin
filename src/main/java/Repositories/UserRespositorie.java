package Repositories;

import Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespositorie extends JpaRepository<User,Long> {
}
