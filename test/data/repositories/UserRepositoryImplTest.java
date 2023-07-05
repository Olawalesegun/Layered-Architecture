package data.repositories;

import data.models.User;
import data.repositories.UserRepositoryImpl;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

class UserRepositoryImplTest {
    UserRepository userRepository = new UserRepositoryImpl();
    User user;

    @BeforeEach
    void setUp() {
        user = new User();
    }

    @Test
    public void saveOneUser_countIsOneTest() {
        user.setUserName("");
        assertNotNull(user);
        userRepository.save(user);
        assertEquals(1, userRepository.count());
    }

    @Test
    public void saveTwoUser_countIsTwoTest() {
        User user2 = new User();
        user.setUserName("Segun");
        userRepository.save(user);
        user2.setUserName("Tunde");
        userRepository.save(user2);
        assertEquals(2, userRepository.count());
    }

    @Test
    public void saveOneUser_findOneTest() {
        user.setUserName("Damidos");
        userRepository.save(user);
        assertEquals(user, userRepository.findById(1));
    }
    @Test
    public void saveTwo_updateOne_countIsTwoTest(){
        User user2 = new User();
        user.setUserName("Dallas");
        user2.setUserName("SiliconValley");
        userRepository.save(user);
        userRepository.save(user2);
        userRepository.update(user);
        assertEquals(2,userRepository.count());
    }
}