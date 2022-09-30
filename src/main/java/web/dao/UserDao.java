package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    User findUser(Integer id);

    void updateUser(User user);

    void deleteUser(Integer id);

    List<User> getAllUsers();
}
