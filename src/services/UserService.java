package services;

public interface UserService {
    void register(String userName, String password);
    void login(String userName, String password);
    void changePassword(String userName, String oldPassWord, String newPassword);
}
