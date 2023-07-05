package data.repositories;

import data.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository{

    List<User> userList = new ArrayList();
    @Override
    public User save(User user) {
        userList.add(user);
        user.setId(generateId());
        return user;
    }

    @Override
    public User findById(int id) {
        for(User user: userList){
            if(user.getId() == id)
                return user;
        }
        return null;
    }
    public void update(User user){
       int index = userList.indexOf(user);
       userList.set(index, user);
    }

    @Override
    public void delete(User user) {

    }
    @Override
    public void delete(int id) {

    }
    @Override
    public void deleteAll() {

    }
    @Override
    public long count() {
        return userList.size();
    }
    public int generateId(){
       return userList.size();
    }
}
