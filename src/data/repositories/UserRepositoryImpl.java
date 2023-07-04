package data.repositories;

import data.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository{

    List<User> userList = new ArrayList();
    private long count;
    @Override
    public User save(User user) {
        userList.add(user);
        count++;
        return user;
    }

    @Override
    public User findById(int id) {
        for(User user: userList){
            if(id == user.getId())
                return user;
            else{
                return null;
            }
        }
        return null;
    }
    public int generateID(){
        return userList.size();
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
        return count;
    }
    public int generateId(){
        return userList.size();
    }
}
