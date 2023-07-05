package data.repositories;
import data.models.User;
public interface UserRepository {
    User save(User user);
    User findById(int id);
    void delete(User user);
    void delete(int id);
    void deleteAll();
    long count();

    void update(User user);
}
