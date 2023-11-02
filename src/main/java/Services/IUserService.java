package Services;

import Entity.User;

import java.util.List;

public interface IUserService {
    User addUser(User c);
    List<User> addUser(List<User> Users);
    User editUser(User b);
    List<User> findAll();
    User findById(Long Id);
    void deleteById(Long Id);
    void delete(User b);
}
