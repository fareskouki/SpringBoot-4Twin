package Services;

import Entity.User;
import Repositories.UserRespositorie;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@NoArgsConstructor
@Service
public class UserService implements IUserService{
    UserRespositorie UserRepositorie;
    @Override
    public User addUser(User c) {
        return UserRepositorie.save(c);
    }

    @Override
    public List<User> addUser(List<User> Users) {
        return UserRepositorie.saveAll(Users);
    }

    @Override
    public User editUser(User b) {
        return UserRepositorie.save(b);
    }

    @Override
    public List<User> findAll() {
        return UserRepositorie.findAll();
    }

    @Override
    public User findById(Long Id) {
        return UserRepositorie.findById(Id).get();
    }

    @Override
    public void deleteById(Long Id) {
        UserRepositorie.deleteById(Id);
    }

    @Override
    public void delete(User b) {
        UserRepositorie.delete(b);
    }
}
